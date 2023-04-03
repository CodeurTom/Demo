package Groupe02.demo.service;

import Groupe02.demo.entities.Client;

import java.util.List;

public interface ClientServiceImpl {
    public List<Client> showClient();
    public Client saveClient (Client client);
    public Client getOneClient (Long id);
    public void deleteClient (Long id);


}
