package com.exercise.springboot.Service;
import com.exercise.springboot.Model.Profile;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private Profile profile;

    public ProfileService(){
        this.profile=new Profile("Harika", 24,1234567808);
    }

    public Profile getProfile(){
        return profile;
    }
}
