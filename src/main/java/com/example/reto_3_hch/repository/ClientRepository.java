package com.example.reto_3_hch.repository;


import com.example.reto_3_hch.entities.Client;
import com.example.reto_3_hch.repository.CrudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }
    public Client save(Client p){
        return clientCrudRepository.save(p);
    }
    public void delete(Client p){
        clientCrudRepository.delete(p);
    }
}
