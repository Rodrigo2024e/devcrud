package com.devsuperior.devcrud.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.devcrud.dto.ClientDTO;
import com.devsuperior.devcrud.entities.Client;
import com.devsuperior.devcrud.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findById (Long id) {
		Client client = repository.findById(id).get();
		return new ClientDTO(client);
	}
}