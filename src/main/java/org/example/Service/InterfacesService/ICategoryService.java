package org.example.Service.InterfacesService;

import org.example.Entities.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Long id);
    Category createCategory(Category category);
//    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
