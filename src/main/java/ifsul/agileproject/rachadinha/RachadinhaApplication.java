package ifsul.agileproject.rachadinha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class RachadinhaApplication {

  public static void main(String[] args) {
    SpringApplication.run(RachadinhaApplication.class, args);
    System.out.println("Hello, world!");
    System.out.println("Just a Test!");
  }

  @GetMapping("/")
  public String welcome(){
    return "Hello World";
  }

}
