package com.lucas_costa.course.services;

import com.lucas_costa.course.entities.Category;
import com.lucas_costa.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category
    findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
