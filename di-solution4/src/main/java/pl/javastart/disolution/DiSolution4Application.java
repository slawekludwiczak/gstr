package pl.javastart.disolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
class DiSolution4Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DiSolution4Application.class, args);
        LinguController controller = ctx.getBean(LinguController.class);
        controller.mainLoop();
    }

    @Bean
    Scanner scanner() {
        return new Scanner(System.in);
    }
}
