package com.example.project1.controller;

import com.example.project1.models.Address;
import com.example.project1.service.AddressService;
import org.attoparser.prettyhtml.PrettyHtmlMarkupHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    public AddressService addressService;

    @GetMapping
    public List<Address>getAllAddress(){
        return addressService.findAll();
    }
    @PostMapping
    public Address insetAdress(@RequestBody Address address){
        return addressService.save(address);
    }
}
