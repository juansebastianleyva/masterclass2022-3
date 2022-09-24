package com.usa.misiontic.masterclass3.repository;

import com.usa.misiontic.masterclass3.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservasRepository {

    @Autowired
    private ReservasCrudRepository reservasCrudRepository;

    public List<Reservas> getAll(){
        return (List<Product>) reservasCrudRepository.findAll();
    }
    public Optional<Reservas> getProduct(int id){
        return reservasCrudRepository.findById(id);
    }
    public Reservas save(Reservas p){
        return reservasCrudRepository.save(p);
    }
    public void delete(Reservas p){
        reservasCrudRepository.delete(p);
    }

}
