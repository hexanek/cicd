package pl.wedel.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dogs")
public class HomeController
{

    private final DogRepository dogRepository;

    public HomeController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }



    @PostMapping
    public Dog addDog(){
        return this.dogRepository.save(new Dog("dogg"));
    }

    @GetMapping
    public Iterable<Dog> helloo(){
        return dogRepository.findAll();
    }
}
