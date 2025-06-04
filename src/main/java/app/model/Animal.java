package app.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {
    private String name;

    public abstract String makeSound();
}
