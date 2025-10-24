package org.example.Service;

import jakarta.servlet.annotation.WebServlet;
import org.example.Dto.FilmDto;
import org.example.Entities.Category;
import org.example.Entities.Director;
import org.example.Entities.Film;
import org.example.Repository.ICategoryRepository;
import org.example.Repository.IDirectorRespository;
import org.example.Repository.IFilmRepository;
import org.example.Service.InterfacesService.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class FilmsServiceImpl implements IFilmService {

    @Autowired
    IFilmRepository filmRepository;
    @Autowired
    IDirectorRespository directorRespository;
    @Autowired
    ICategoryRepository categoryRepository;




    public List<Film> getAllFilms(){
        return filmRepository.findAll();
    }

    public Film createFilm(FilmDto filmDto){

       Category category = categoryRepository.findById(filmDto.getCategoryId()).orElseThrow(()-> new RuntimeException("Category not found in this id " + filmDto.getCategoryId()));

       Director director = directorRespository.findById(filmDto.getDirectorId()).orElseThrow(()-> new RuntimeException("Director not found in this id " + filmDto.getDirectorId()));

       Film newFilm = new Film();
       newFilm.setCategory(category);
       newFilm.setDirector(director);
       newFilm.setTitle(filmDto.getTitle());
       newFilm.setReleaseYear(filmDto.getReleaseYear());
       newFilm.setDuration(filmDto.getDuration());
       newFilm.setSynopsis(filmDto.getSynopsis());
       newFilm.setRating(filmDto.getRating());


        return filmRepository.save(newFilm);
    }


    public Optional<Film> getMovieByID(Long id)
    {
        return  filmRepository.findById(id);
    }
}
