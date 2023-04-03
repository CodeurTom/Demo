package Groupe02.demo.controllers;

import Groupe02.demo.entities.Client;
import Groupe02.demo.services.ClientService;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class ClientRestController {
    public class ClientController {
        @Autowired
        ClientService cs;

        @PostMapping("clients")
        public Client saveClient(@RequestBody Client client) {
            return cs.saveClient(client);
        }

        //@GetMapping("clients/{id}")
        //public Client getOneClient(@PathVariable Long id) {
        //  return cs.saveClient(id);
        //}

        //@GetMapping("clients")
        //public List<Client> showClient() {
        //  return cs.showClient();
        //}

        //@DeleteMapping("clients/{id}")
        //public void deleteClient(@PathVariable Long id) {
        //cs.deleteClient(Long.valueOf(id));
        //}

        //@PutMapping("clients/{id}")
        //public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
        //  client.setId(id);
        //  return cs.saveClient(client);
        //}
    }
}
