package com.example.demo.service;

import com.example.demo.model.CategoryImages;
import com.example.demo.repository.CategoryImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryImageService {

    private final CategoryImageRepository categoryImageRepository;

    public List<CategoryImages> getAllCategoryImages() {
        return categoryImageRepository.findAll();
    }

    public void addCategoryImage(CategoryImages categoryImage) {
        categoryImageRepository.save(categoryImage);
    }
}