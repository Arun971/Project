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
    public String  insetAddress(@RequestBody Address address){
        addressService.save(address);
        return "Address added";
    }

    @PutMapping
    public String updateAddress(@RequestBody Address address){
       addressService.save(address);
       return "address add";
    }

    @DeleteMapping("/{id}")
    public String deleteAddress(@PathVariable long id){
        return addressService.delete(id);
    }

}
