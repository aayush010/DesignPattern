package com.example.duck.DuckTypes;

import com.example.duck.Duck.Behaviour.FlyBehaviour;
import com.example.duck.Duck.Behaviour.Flyingtypes.NoFly;
import com.example.duck.Duck.Behaviour.QuackBehaviour;
import com.example.duck.Duck.Behaviour.QuackingTypes.CanQuack;
import com.example.duck.Duck.Duck;

public class RubberDuck extends Duck {
    @Override
    public String display() {
        return "I am a rubber Duck";
    }
}
