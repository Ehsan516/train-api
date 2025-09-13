package net.deepblacksea.train_api.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity @Table(name="sets")
public class SetEntry {
    @Id private UUID id;
    @Column(name="session_id",nullable=false) private UUID sessionId;
    @Column(name="exercise_id",nullable=false) private UUID exerciseId;
    @Column(name="weight_kg") private Double weightKg;
    private Integer reps;
    private Double rpe;
    private String notes;

    public UUID getId(){return id;} public void setId(UUID id){this.id=id;}
    public UUID getSessionId(){return sessionId;} public void setSessionId(UUID s){this.sessionId=s;}
    public UUID getExerciseId(){return exerciseId;} public void setExerciseId(UUID e){this.exerciseId=e;}
    public Double getWeightKg(){return weightKg;} public void setWeightKg(Double w){this.weightKg=w;}
    public Integer getReps(){return reps;} public void setReps(Integer r){this.reps=r;}
    public Double getRpe(){return rpe;} public void setRpe(Double r){this.rpe=r;}
    public String getNotes(){return notes;} public void setNotes(String n){this.notes=n;}
}
