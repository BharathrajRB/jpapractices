package com.jpa.practices.jpapractices.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.practices.jpapractices.modal.address;

public interface AddressRepository extends JpaRepository<address, Integer> {
    @Query(nativeQuery = true, value = "Select address.id,address.city,address.state from address join employee address.employee_id=employee.id ")

    Optional<address> findAddressByid(@Param("employeId") int employeeId);
}

/*
 * SELECT ea.id, ea.city, ea.state FROM
 * gfgmicroservicesdemo.address ea join gfgmicroservicesdemo.employee
 * 
 */
