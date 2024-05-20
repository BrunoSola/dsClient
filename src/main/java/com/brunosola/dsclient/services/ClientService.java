package com.brunosola.dsclient.services;

import com.brunosola.dsclient.dto.ClientDTO;
import com.brunosola.dsclient.entities.Client;
import com.brunosola.dsclient.repositories.ClientRepository;
import com.brunosola.dsclient.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
        return new ClientDTO(client);
    }
}
