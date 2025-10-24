package org.example.Service;

import org.example.Entities.Director;
import org.example.Repository.IDirectorRespository;
import org.example.Service.InterfacesService.IDirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorServiceImpl implements IDirectorService {

    @Autowired
    private IDirectorRespository directorRespository;

    public List<Director> getAllDirectors(){
        return directorRespository.findAll();
    }

    public Optional<Director> getDirectorById(Long id){
        return directorRespository.findById(id);
    }

    public Director createDirector(Director director)
    {
        return directorRespository.save(director);
    }

    public void deleteDirector(Long id)
    {
        directorRespository.deleteById(id);
    }


}
