package com.epsi.mspr.payetonkawa.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsService {
    @Autowired
    private ClientsRepository repository;

    public List<ClientEntity> getAllClients() {
        return this.repository.findAll();
    }

    public ClientEntity getClientByID(Long id) {
        return this.repository.findClientByClientID(id);
    }

    public ClientEntity getClientByFullName(String fullName) {
        return this.repository.findClientEntityByFullName(fullName);
    }
    public ClientEntity postClient(ClientEntity clientEntity) {
        return this.repository.save(clientEntity);
    }
    public ClientEntity patchClient(Long id, ClientEntity clientEntity) {
        ClientEntity toUpdate = this.repository.findClientByClientID(id);
        toUpdate.setUsername(clientEntity.getUsername());
        toUpdate.setFirstName(clientEntity.getFirstName());
        toUpdate.setFamilyName(clientEntity.getFamilyName());
        toUpdate.setAddress(clientEntity.getAddress());
        toUpdate.setCreatedAt(clientEntity.getCreatedAt());
        return this.repository.save(clientEntity);
    }
    public ClientEntity deleteClient(Long id) {
        return this.repository.deleteClientEntityByClientID(id);
    }
}
