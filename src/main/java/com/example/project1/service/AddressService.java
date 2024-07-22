package com.example.project1.service;

import com.example.project1.models.Address;
import com.example.project1.models.Users;
import com.example.project1.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    public AddressRepository addressRepository;

    public List<Address>findAll(){
        return addressRepository.findAll();
    }
    public Address save(Address address){
        return addressRepository.save(address);
    }
}
