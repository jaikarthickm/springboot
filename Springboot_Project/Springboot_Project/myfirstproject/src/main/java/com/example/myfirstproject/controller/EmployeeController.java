package com.example.myfirstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myfirstproject.employeeentity.EmployeeEntity;
import com.example.myfirstproject.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService es;

    @PostMapping("adddata")
public ResponseEntity<EmployeeEntity>add(@RequestBody EmployeeEntity em){
    EmployeeEntity obj=es.create(em);
   return new ResponseEntity<>(obj,HttpStatus.CREATED); 
}
@GetMapping("showdata")
public ResponseEntity <List<EmployeeEntity>>showinfo(){
    return new ResponseEntity<>(es.getalldetails(),HttpStatus.OK);
}
@GetMapping("getdata")
public ResponseEntity <List<EmployeeEntity>>getinfo(){
    return new ResponseEntity<>(es.getalldetails(),HttpStatus.OK);
}

@PutMapping("/api/employee/{employeeId}")
    public ResponseEntity<EmployeeEntity> putMethodName(@PathVariable("employeeId") int id, @RequestBody EmployeeEntity employee) {
        if(es.updateDetails(id,employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/api/employee/{employeeId}")
    public ResponseEntity<Boolean> delete(@PathVariable("employeeId") int id)
    {
        if(es.deleteEmployee(id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }

}