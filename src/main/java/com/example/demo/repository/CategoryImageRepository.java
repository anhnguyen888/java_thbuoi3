package com.example.demo.repository;
import com.example.demo.model.CategoryImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryImageRepository
        extends JpaRepository<CategoryImages, Long> {
}
