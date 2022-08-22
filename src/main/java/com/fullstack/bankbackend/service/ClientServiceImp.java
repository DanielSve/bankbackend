package com.fullstack.bankbackend.service;

import com.fullstack.bankbackend.model.Client;
import com.fullstack.bankbackend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
