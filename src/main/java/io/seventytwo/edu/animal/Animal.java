package io.seventytwo.edu.animal;

public abstract sealed class Animal permits Pet, WildAnimal {

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
