package com.exercise.springboot.Controller;
import com.exercise.springboot.Model.Exercise;
import com.exercise.springboot.Service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ExerciseController {

    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService){
        this.exerciseService = exerciseService;
    }

    @GetMapping("/exercises")
    public List<Exercise> getAllExercises(){
        return exerciseService.getAllExercises();
    }

    @GetMapping("/exercise")
    public Exercise getExerciseById(@RequestParam Integer id){
        Optional<Exercise> exercise = exerciseService.getExerciseById(id);
        return (Exercise) exercise.orElse(null);
    }
}
