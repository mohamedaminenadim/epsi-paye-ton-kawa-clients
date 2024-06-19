package com.epsi.mspr.payetonkawa.clients;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/customers")
public class ClientsController {

    public ClientsService clientsService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ClientEntity> getAllClients() {
        return clientsService.getAllClients();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ClientEntity getClient(@PathVariable Long id) {
        return clientsService.getClientByID(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ClientEntity postClient(@RequestBody ClientEntity clientEntity) {
        return clientsService.postClient(clientEntity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ClientEntity getClient(@PathVariable Long id, @RequestBody ClientEntity clientEntity) {
        return clientsService.patchClient(id, clientEntity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ClientEntity deleteClient(@PathVariable Long id) {
        return clientsService.deleteClient(id);
    }


}
