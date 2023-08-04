package com.example.duck;

import com.example.duck.Duck.Behaviour.Flyingtypes.FlyWithWings;
import com.example.duck.Duck.Behaviour.QuackingTypes.CanSqueak;
import com.example.duck.DuckTypes.RubberDuck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DuckApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuckApplication.class, args);
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.setFlyBehaviour(new FlyWithWings());
		rubberDuck.setQuackBehaviour(new CanSqueak());
		System.out.println(rubberDuck.display());
		System.out.println(rubberDuck.fly());
		System.out.println(rubberDuck.quack());
		System.out.println(rubberDuck.swim());
	}

}
