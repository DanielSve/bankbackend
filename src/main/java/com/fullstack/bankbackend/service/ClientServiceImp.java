package com.fullstack.bankbackend.service;

import com.fullstack.bankbackend.model.Client;
import com.fullstack.bankbackend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public String removeClient(Long id) {
        Client client = clientRepository.findById(id).orElse(null);
        return (client == null) ? "Could not find client" : "Deleted client with id " + id;
    }
}
