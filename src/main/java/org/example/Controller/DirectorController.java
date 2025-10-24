package org.example.Controller;


import org.example.Entities.Category;
import org.example.Entities.Director;
import org.example.Service.DirectorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/director")
public class DirectorController {

    @Autowired
    private DirectorServiceImpl directorService;


    @GetMapping
    public List<Director> getAllDirectors()
    {
        return directorService.getAllDirectors();
    }

    @PostMapping
    public Director createDirector(@RequestBody Director director)
    {
        return directorService.createDirector(director);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Director> getDirectorById(@PathVariable("id") Long id)
    {
        Optional<Director> director = directorService.getDirectorById(id);
        return director.map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDirector(@PathVariable("id") Long id) {
        directorService.deleteDirector(id);
        return ResponseEntity.noContent().build();
    }

}
