package com.fullstack.bankbackend.repository;

import com.fullstack.bankbackend.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
