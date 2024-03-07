package com.jpa.practices.jpapractices.Config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jpa.practices.jpapractices.Service.AddressService;

@Configuration
public class AddressConfig {
    @Bean
    @Qualifier("AddressService")
    public AddressService empBean() {
        return new AddressService();
    }

    @Bean
    public ModelMapper model() {
        return new ModelMapper();
    }
}
