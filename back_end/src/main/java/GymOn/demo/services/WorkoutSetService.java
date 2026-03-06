package GymOn.demo.services;

import GymOn.demo.entitites.WorkoutSet;
import GymOn.demo.repositories.WorkoutSetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutSetService {
    private final WorkoutSetRepository workoutSetRepository;

    public WorkoutSetService(WorkoutSetRepository workoutSetRepository) {
        this.workoutSetRepository = workoutSetRepository;
    }

    public WorkoutSet createWorkoutSet(WorkoutSet workoutSet) {
        return workoutSetRepository.save(workoutSet);
    }

    public Optional<WorkoutSet> getWorkoutSetById(Long id) {
        return workoutSetRepository.findById(id);
    }

    public List<WorkoutSet> getAllWorkoutSets() {
        return workoutSetRepository.findAll();
    }
}
