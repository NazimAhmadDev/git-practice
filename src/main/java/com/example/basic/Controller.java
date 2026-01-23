package com.example.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Service service;

    @PostMapping
    public Model createModel(@RequestBody Model model) {
        return service.saveModel(model);
    }

    @GetMapping("")
    public List<Model> getAll() {
        return service.getAllModels();
    }

}
