package bw.co.roguesystems.molemi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SharedAutoConfiguration.class)
public class MolemiWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MolemiWebApplication.class, args);
    }
}