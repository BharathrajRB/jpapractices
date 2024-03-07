package com.jpa.practices.jpapractices.Repository;
 
import java.util.Optional; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.query.Param;

import com.jpa.practices.jpapractices.modal.address; 
  
public interface AddressRepo extends JpaRepository<address, Integer> { 
  
    @Query( 
        nativeQuery = true, 
        value 
        = "SELECT ea.id, ea.city, ea.state FROM jparepo.address ea join jparepo.employee e on e.id = ea.employee_id where ea.employee_id=:employeeId") 
       Optional<address> findAddressByEmployeeeId(@Param("employeeId") int employeeId); 
}