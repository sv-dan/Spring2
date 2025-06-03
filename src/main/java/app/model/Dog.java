package app.model;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends Animal {

    public Dog() {
        setName("Лайка");
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
