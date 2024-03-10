
// package com.jpa.practices.jpapractices.Repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

// import java.util.Optional;

// import com.jpa.practices.jpapractices.modal.address;

// public interface AddressRepo extends JpaRepository<address, Integer> {

// @Query(nativeQuery = true, value = "SELECT ea.id, ea.city, ea.state FROM
// address ea join employee e on e.id = ea.employee_id where
// ea.employee_id=:employeeId")
// Optional<address> findAddressByEmployeeId(@Param("employeeId") int
// employeeId);
// }
