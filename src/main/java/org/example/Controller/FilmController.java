package org.example.Controller;

import jakarta.servlet.annotation.WebServlet;
import org.example.Dto.FilmDto;
import org.example.Entities.Film;
import org.example.Service.FilmsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/films")
public class FilmController {

    @Autowired
    FilmsServiceImpl filmsService;

    @GetMapping
    public List<Film> getAllFilms() {
        return filmsService.getAllFilms();
    }

    @PostMapping
    public Film createFilm(@RequestBody FilmDto film) {

        return filmsService.createFilm(film);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable("id") Long id)
    {
        Optional<Film> film = filmsService.getMovieByID(id);

        return film.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
