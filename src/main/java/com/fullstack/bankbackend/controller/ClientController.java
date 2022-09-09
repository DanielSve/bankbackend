package com.fullstack.bankbackend.controller;

import com.fullstack.bankbackend.model.Client;
import com.fullstack.bankbackend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clients")
@CrossOrigin
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("")
    private List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping("/add")
    private Client addClient(@RequestBody @Valid Client client) {
        return clientService.addClient(client);
    }

    @DeleteMapping("/delete/{id}")
    private String deleteClient(@PathVariable Long id) {
       return clientService.removeClient(id);
    }


}
