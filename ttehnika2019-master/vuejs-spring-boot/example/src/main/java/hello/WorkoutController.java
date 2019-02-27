package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WorkoutController {

    @Autowired WorkoutRepository repository;

    @GetMapping("/getall")
    @ResponseBody
    public List<Workout> getAll() {
        return repository.findAll();
    }

    @GetMapping("/")
    @ResponseBody
    public String getResponse() {
        return "Hello";
    }

    @PostMapping("/add")
    @ResponseBody
    public Workout addWorkout(@RequestBody Workout workout) {
        repository.save(workout);
        return workout;
    }
}
