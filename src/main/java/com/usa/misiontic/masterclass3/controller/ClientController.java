package com.usa.misiontic.masterclass3.controller;


import com.usa.misiontic.masterclass3.entities.Client;
import com.usa.misiontic.masterclass3.entities.Product;
import com.usa.misiontic.masterclass3.service.ClientService;
import com.usa.misiontic.masterclass3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }
    @PostMapping("/save")
    public Client save(@RequestBody  Client c){
        return clientService.save(c);
    }
}
