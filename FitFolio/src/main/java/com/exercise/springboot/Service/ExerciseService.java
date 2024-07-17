package com.exercise.springboot.Service;
import com.exercise.springboot.Model.Exercise;
import com.exercise.springboot.Controller.ExerciseController;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {
    private List<Exercise> exercisesList;

    public ExerciseService() {
        exercisesList = new ArrayList<>();

        Exercise e1 = new Exercise(1, "Squats", "Stand with feet shoulder-width apart. Lower your body until thighs are parallel to the ground. Keep back straight and chest up. Push through heels to return to starting position. Repeat for desired number of repetitions. Rest for 30 seconds between sets.", "Barbell", 3, "Legs");
        Exercise e2 = new Exercise(2, "Push-ups", "Start in a plank position with hands shoulder-width apart. Lower body until chest nearly touches the floor. Push through palms to extend arms and return to plank. Repeat for desired number of repetitions. Rest for 30 seconds between sets.", "Bodyweight", 4, "Chest");
        Exercise e3 = new Exercise(3, "Deadlifts", "Stand with feet hip-width apart, holding barbell in front of thighs. Hinge at hips to lower barbell, keeping back straight. Push through heels to stand upright. Repeat for desired number of repetitions. Rest for 60 seconds between sets.", "Barbell", 2, "Back");
        Exercise e4 = new Exercise(4, "Plank", "Start in a push-up position with elbows directly under shoulders. Hold body in a straight line from head to heels. Engage core muscles and hold for desired duration. Rest for 30 seconds between sets.", "Bodyweight", 5, "Core");
        Exercise e5 = new Exercise(5, "Bicep Curls", "Stand with feet hip-width apart, holding dumbbells at sides. Curl dumbbells toward shoulders, keeping elbows close to body. Lower dumbbells back to starting position. Repeat for desired number of repetitions. Rest for 30 seconds between sets.", "Dumbbells", 3, "Arms");
        Exercise e6 = new Exercise(6, "Crunches", "Lie on back with knees bent and hands behind head. Lift shoulder blades off the ground by contracting abdominal muscles. Lower back down to starting position. Repeat for desired number of repetitions. Rest for 30 seconds between sets.", "Bodyweight", 4, "Core");

        exercisesList.addAll(Arrays.asList(e1, e2, e3, e4, e5, e6));
    }

    public List<Exercise> getAllExercises() {
        return exercisesList;
    }

    public Optional<Exercise> getExerciseById(Integer id){
        Optional<Exercise> opt = Optional.empty();
        for(Exercise exercise : exercisesList){
            if(id == exercise.getId()){
                opt = Optional.of(exercise);
                return opt;
            }
        }
        return opt;
    }
}
