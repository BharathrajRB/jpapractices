// package com.jpa.practices.jpapractices.Service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import java.util.Optional;

// import com.jpa.practices.jpapractices.Repository.AddressRepo;
// import com.jpa.practices.jpapractices.Response.AddressResponse;
// import com.jpa.practices.jpapractices.modal.address;

// @Service
// public class AddressService {

// @Autowired
// private AddressRepo addressRepo;

// public AddressResponse findAddressByEmployeeId(int employeeId) {
// Optional<address> addressByEmployeeId =
// addressRepo.findAddressByEmployeeId(employeeId);

// return addressByEmployeeId.map(entity -> {
// AddressResponse addressResponse = new AddressResponse();
// addressResponse.setId(entity.getId());
// addressResponse.setCity(entity.getCity());
// addressResponse.setState(entity.getState());
// return addressResponse;
// }).orElse(null);
// }
// }
