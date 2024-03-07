package com.jpa.practices.jpapractices.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.practices.jpapractices.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    @Query(nativeQuery = true, value = "select address.city,address.state from jparepo.address join  jparepo.employee on employee.id=address.employee.id")
    Optional<Address> getAddressByEmpId(@Param("employeeId") int employeeId);
}
