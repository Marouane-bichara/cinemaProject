package org.example.Repository;

import org.example.Entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFilmRepository extends JpaRepository <Film , Long> {
}
