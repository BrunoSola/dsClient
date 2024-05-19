package com.brunosola.dsclient.repositories;

import com.brunosola.dsclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
