package com.example.duck.Duck;

import com.example.duck.Duck.Behaviour.FlyBehaviour;
import com.example.duck.Duck.Behaviour.QuackBehaviour;

public abstract class Duck {

    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public String quack(){
        return quackBehaviour.quack();
    };

    public String fly(){
        return flyBehaviour.fly();
    };

    public String swim(){
        return "swimming..";
    };

    public abstract String display();
}
