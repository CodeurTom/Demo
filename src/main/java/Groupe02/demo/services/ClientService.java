package Groupe02.demo.services;

import Groupe02.demo.entities.Client;
import Groupe02.demo.repositories.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository cr;
    public Client saveClient (Client client) {
        client.setId(Long.valueOf(client.getNom().substring(0, 2).toUpperCase()+
                client.getPrenom().substring(0, 2).toUpperCase()+client.getDateNaissance().getYear()+
                client.getSexe().substring(0, 2).toUpperCase()+client.getAdresse().substring(0, 2).toUpperCase()+
                client.getTelephone().substring(0, 2).toUpperCase()+client.getCourriel().substring(0, 2).toUpperCase()+
                client.getNationalite().substring(0, 2).toUpperCase()+client.getComptes().subList(0, 2)));

        return cr.save(client);
    }

    public List<Client> showClient() {
        return cr.findAll();
    }
    public Client getOneClient (Long id) {
        return cr.findById(id).get();
    }
    public void deleteClient (Long id) {
       cr.deleteById(id);
    }
}
