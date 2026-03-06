package GymOn.demo.entitites;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sets")
public class WorkoutSet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "workout_id")
    private Workout workout;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    private int setNumber;
    private int reps;
    private Double weight;
}
