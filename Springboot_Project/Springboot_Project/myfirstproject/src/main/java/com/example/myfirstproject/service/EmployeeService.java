package com.example.myfirstproject.service;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirstproject.employeeentity.EmployeeEntity;
import com.example.myfirstproject.repository.EmployeeRepo;

// import jakarta.persistence.metamodel.ListAttribute;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo er;

    public EmployeeEntity create(EmployeeEntity ee){
        return er.save(ee);
    }

    public java.util.List<EmployeeEntity> getalldetails(){
        return er.findAll();
    
    }

    public EmployeeEntity getEmployeeById(int id){
        return er.findById(id).orElse(null);
    }

    public boolean updateDetails(int id,EmployeeEntity employee)
        {
            if(this.getEmployeeById(id)==null)
            {
                return false;
            }
            try{
                er.save(employee);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }

        public boolean deleteEmployee(int id)
        {
            if(this.getEmployeeById(id) == null)
            {
                return false;
            }
            er.deleteById(id);
            return true;
        }

}