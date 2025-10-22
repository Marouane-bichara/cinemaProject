import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-data-config.xml");

//    UserRepository userRepo = context.getBean(UserRepository.class);
//        ICategoryRepository categoryRepository = context.getBean(ICategoryRepository.class);

    }
}
