import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by flori_000 on 16/05/2017.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"dao", "controller", "model", "service"})
@EntityScan(basePackages = {"model"})
@EnableJpaRepositories
@Import(value = {WebSecurity.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
