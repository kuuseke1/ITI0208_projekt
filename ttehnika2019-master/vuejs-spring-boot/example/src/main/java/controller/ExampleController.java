package controller;

import dao.Workout;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.WorkoutRepository;
import java.util.stream.Collectors;
import java.util.Collection;

@RestController
public class ExampleController {

    private WorkoutRepository repository;

    public ExampleController(WorkoutRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/hello-world")
    public Collection<Workout> getHelloWorld() {
        return repository.findAll().stream().collect(Collectors.toList());
    }
}
