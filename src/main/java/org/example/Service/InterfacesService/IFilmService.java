package org.example.Service.InterfacesService;

import org.example.Dto.FilmDto;
import org.example.Entities.Director;
import org.example.Entities.Film;

import java.util.List;

public interface IFilmService {
    List<Film> getAllFilms();
    Film createFilm(FilmDto film);

}
