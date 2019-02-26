package dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private List<Exercise> exercises;
    private Long timestamp;

    protected Workout() {}

    public Workout(List<Exercise> exercises, String lastName) {
        this.exercises = exercises;
        this.timestamp = new Date().getTime();
    }

    @Override
    public String toString() {
        return String.format(
                "Workout[id=%d, exercises='%s', timestamp='%s']",
                id, exercises, timestamp);
    }

}