package com.fullstack.bankbackend.service;


import com.fullstack.bankbackend.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();
    Client addClient(Client client);
    String removeClient(Long id);
    Client updateClient(Long id, Client updatedClient);
}
