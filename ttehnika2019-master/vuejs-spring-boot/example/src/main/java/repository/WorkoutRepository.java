package repository;

import dao.Exercise;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import dao.Workout;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@RepositoryRestResource
public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}

@Component
class WorkoutCLI implements CommandLineRunner {
    private final WorkoutRepository repository;

    public WorkoutCLI(WorkoutRepository repository) {
        this.repository = repository;
    }
    public void run(String... strings) {
        String[] exerciseNames = {"push-up", "pull-up", "sit-up", "jumping jacks", "squats"};
        Integer[] repetitions = {10, 20, 30, 10, 20};
        System.out.println("hi");
        List<Exercise> exerciseList = new ArrayList<>();
        for (int i = 0; i < exerciseNames.length; i++) {
            exerciseList.add(new Exercise(exerciseNames[i], repetitions[i]));
        }
        repository.save(new Workout(exerciseList));
        repository.findAll().forEach(System.out::println);

    }
}