package org.example.Repository;

import org.example.Entities.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDirectorRespository extends JpaRepository<Director , Long> {
}
