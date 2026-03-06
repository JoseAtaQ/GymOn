package GymOn.demo.controllers;

import GymOn.demo.entitites.WorkoutSet;
import GymOn.demo.services.WorkoutSetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sets")
public class WorkoutSetController {
    private final WorkoutSetService workoutSetService;

    public WorkoutSetController(WorkoutSetService workoutSetService) {
        this.workoutSetService = workoutSetService;
    }

    @PostMapping
    public ResponseEntity<WorkoutSet> createWorkoutSet(@RequestBody WorkoutSet workoutSet) {
        return ResponseEntity.ok(workoutSetService.createWorkoutSet(workoutSet));
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkoutSet> getWorkoutSetById(@PathVariable Long id) {
        return workoutSetService.getWorkoutSetById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
