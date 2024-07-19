package com.exercise.springboot.Controller;

import com.exercise.springboot.Model.Profile;
import com.exercise.springboot.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService){
        this.profileService = profileService;
    }

    @GetMapping("/Profile")
    public Profile getProfile(){
        return profileService.getProfile();
    }
}
