package com.britolmbs.projetowebservice.services;

import com.britolmbs.projetowebservice.entities.Product;
import com.britolmbs.projetowebservice.entities.User;
import com.britolmbs.projetowebservice.repositories.ProductRepository;
import com.britolmbs.projetowebservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj =  repository.findById(id);
        return obj.get();
    }
}
