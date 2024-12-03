
package com.devsuperior.devcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.devcrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
