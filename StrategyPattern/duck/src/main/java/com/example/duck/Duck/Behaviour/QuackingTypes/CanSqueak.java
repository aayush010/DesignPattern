package com.example.duck.Duck.Behaviour.QuackingTypes;

import com.example.duck.Duck.Behaviour.QuackBehaviour;

public class CanSqueak implements QuackBehaviour {

    @Override
    public String quack() {
        return "squeak squeak .... squeak";
    }
}
