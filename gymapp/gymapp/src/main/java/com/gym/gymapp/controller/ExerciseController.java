package com.gym.gymapp.controller;

import com.gym.gymapp.model.Exercise;
import com.gym.gymapp.repository.ExerciseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    private final ExerciseRepository repo;

    public ExerciseController(ExerciseRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Exercise addExercise(@RequestBody Exercise exercise) {
        return repo.save(exercise);
    }

    @GetMapping
    public List<Exercise> getAllExercises() {
        return repo.findAll();
    }

    @PutMapping("/{id}")
    public Exercise updateExercise(@PathVariable Long id, @RequestBody Exercise newExercise) {
        return repo.findById(id)
                .map(exercise -> {
                    exercise.setName(newExercise.getName());
                    exercise.setWeight(newExercise.getWeight());
                    exercise.setReps(newExercise.getReps());
                    return repo.save(exercise);
                }).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void deleteExercise(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
