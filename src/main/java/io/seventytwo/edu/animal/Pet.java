package io.seventytwo.edu.animal;

public abstract sealed class Pet extends Animal permits Dog, Cat{
}
