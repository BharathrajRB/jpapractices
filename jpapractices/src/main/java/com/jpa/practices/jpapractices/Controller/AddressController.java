package com.jpa.practices.jpapractices.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.jpa.practices.jpapractices.Response.AddressResponse;
import com.jpa.practices.jpapractices.Service.AddressService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class AddressController {

    @Autowired
    
    @Qualifier("addressService")
    private AddressService service;

    @GetMapping("/address/{empId}")
    public ResponseEntity<AddressResponse> getAddress(@PathVariable("empId") int empId) {

        AddressResponse resp = service.findAddressByEmpId(empId);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

}
