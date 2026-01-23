package com.example.basic;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;

    public Model saveModel(Model model) {
        return repository.save(model);
    }

    public java.util.List<Model> getAllModels() {
        return repository.findAll();
    }

}
