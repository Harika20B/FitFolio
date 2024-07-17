package com.exercise.springboot.Model;

public class Exercise {
    private int id;
    private String exercisename;
    private String instructions;
    private String instruments;
    private int sets;
    private String effected_areas;

    public Exercise(int id, String exercisename, String instructions, String instruments,
                    int sets, String effected_areas){
        this.id = id;
        this.exercisename = exercisename;
        this.instructions = instructions;
        this.instruments = instruments;
        this.sets = sets;
        this.effected_areas = effected_areas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExercisename(){
        return exercisename;
    }

    public void setExercisename(String exercisename) {
        this.exercisename = exercisename;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getInstruments() {
        return instruments;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public String getEffected_areas() {
        return effected_areas;
    }

    public void setEffected_areas(String effected_areas) {
        this.effected_areas = effected_areas;
    }
}
