package com.example.duck.Duck.Behaviour.QuackingTypes;

import com.example.duck.Duck.Behaviour.QuackBehaviour;

public class CanQuack implements QuackBehaviour {

    @Override
    public String quack() {
        return "quack quack .... quack";
    }
}
