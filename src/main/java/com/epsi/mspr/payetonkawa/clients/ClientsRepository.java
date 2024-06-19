package com.epsi.mspr.payetonkawa.clients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract interface ClientsRepository extends JpaRepository<ClientEntity, Long> {
    List<ClientEntity> findAll();
    ClientEntity findClientByClientID(Long id);
    ClientEntity findClientEntityByFullName(String fullName);
    ClientEntity save(ClientEntity clientEntity);
    ClientEntity deleteClientEntityByClientID(Long id);
}
