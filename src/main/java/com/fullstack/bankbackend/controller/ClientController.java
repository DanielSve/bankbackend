package com.fullstack.bankbackend.controller;

import com.fullstack.bankbackend.model.Client;
import com.fullstack.bankbackend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("")
    private List<Client> getAllClients() {
        return clientService.getAllClients();
    }
}
