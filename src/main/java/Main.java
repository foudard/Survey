import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by flori_000 on 16/05/2017.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"dao","controller","model"})
@EntityScan(basePackages = {"model"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
