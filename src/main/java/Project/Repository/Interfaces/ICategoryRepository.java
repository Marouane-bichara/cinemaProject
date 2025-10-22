package Project.Repository.Interfaces;

import Project.Entities.Category;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long>{
}
