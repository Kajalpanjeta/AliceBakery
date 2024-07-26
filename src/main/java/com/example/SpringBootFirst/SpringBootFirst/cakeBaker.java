package com.example.SpringBootFirst.SpringBootFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class cakeBaker {
    @Autowired
    Frosting frost;
    @Autowired
    Syrup syrup;

    void BakeClass(){
        frost.getFrostingType();
        syrup.getSyrupType();
    }
}
