package dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Integer repetitions;

    protected Exercise() {}

    public Exercise(Integer repetitions) {
        this.repetitions = repetitions;
    }

    @Override
    public String toString() {
        return String.format(
                "Exercise[id=%d, reps='%s']",
                id, repetitions);
    }

}