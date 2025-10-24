package org.example.Service.InterfacesService;

import org.example.Entities.Category;
import org.example.Entities.Director;

import java.util.List;
import java.util.Optional;

public interface IDirectorService {
    List<Director> getAllDirectors();
    Optional<Director> getDirectorById(Long id);
    Director createDirector(Director director);
    //   Director updateCategory(Long id, Director director);
    void deleteDirector(Long id);
}
