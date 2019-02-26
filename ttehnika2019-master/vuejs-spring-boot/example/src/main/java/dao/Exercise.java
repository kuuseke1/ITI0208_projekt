package dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Exercise {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer repetitions;

    protected Exercise() {}

    public Exercise(String name, Integer repetitions) {
        this.repetitions = repetitions;
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format(
                "Exercise[id=%d, name=%s,reps='%s']",
                id, name, repetitions);
    }

}