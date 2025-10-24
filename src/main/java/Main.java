import org.example.Entities.Category;
import org.example.Repository.ICategoryRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-data-config.xml");

        // Get the repository bean (Spring Data automatically generates the implementation)
        ICategoryRepository categoryRepository = context.getBean(ICategoryRepository.class);

        // Create a new Category
        Category category = new Category();
        category.setName("Action");
        category.setDescription("Movies full of action scenes.");

        // Save it to the database
        categoryRepository.save(category);

        System.out.println("✅ Category saved successfully!");

        // Retrieve and display all categories
        System.out.println("📋 List of categories:");
        categoryRepository.findAll().forEach(System.out::println);
    }
}