package com.example.SpringBootFirst.SpringBootFirst;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnProperty(value = "type.env",havingValue = "Strawberry")
public class Strawberry implements Frosting,Syrup{
    @Override
    public void getFrostingType() {
        System.out.println("Get Strawberry Frosting");
    }

    @Override
    public void getSyrupType() {
        System.out.println("Get Strawberry Syrup");
    }
}
