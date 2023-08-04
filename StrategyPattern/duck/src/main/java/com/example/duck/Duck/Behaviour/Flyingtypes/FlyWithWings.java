package com.example.duck.Duck.Behaviour.Flyingtypes;

import com.example.duck.Duck.Behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public String fly() {
        return "I can fly because i am having wings";
    }
}
