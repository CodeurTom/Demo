package Groupe02.demo.services;

import Groupe02.demo.entities.Client;
import Groupe02.demo.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements ClientServiceImpl {
    private ClientRepository clientRepository;
    public List<Client> showClient() {
        return ClientRepository.findAll();
    }
    public Client saveClient (Client client) {
        return ClientRepository.save (client);
    }
    public Client getOneClient (Long id) {
        return ClientRepository.findById(id).get();
    }
    public void deleteClient (Long id) {
        ClientRepository.delete ById(id);
    }
}
