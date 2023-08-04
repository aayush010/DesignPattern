package com.example.duck.Duck.Behaviour.Flyingtypes;

import com.example.duck.Duck.Behaviour.FlyBehaviour;

public class NoFly implements FlyBehaviour {

    @Override
    public String fly() {
        return "I can't fly.";
    }
}
