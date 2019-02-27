package controller;

import dao.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.WorkoutRepository;

import javax.validation.Valid;

@RestController
public class PostController {

    private final WorkoutRepository workoutRepository;

    @Autowired
    public PostController(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }


    @PostMapping("api/add/post")
    public Workout save(@RequestBody @Valid Workout item) {
        return workoutRepository.save(item);
    }
}
