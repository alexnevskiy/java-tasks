package ru.mail.polis.homework.oop.vet.animals;

import ru.mail.polis.homework.oop.vet.Animal;
import ru.mail.polis.homework.oop.vet.types.MoveType;
import ru.mail.polis.homework.oop.vet.WildAnimal;

public class Shark extends Animal implements WildAnimal {

    private String organizationName;

    public Shark(int legs) {
        super(legs);
    }

    @Override
    public String say() {
        return "Clack Clack";
    }

    @Override
    public MoveType moveType() {
        return MoveType.SWIM;
    }

    @Override
    public String getOrganizationName() {
        return organizationName;
    }

    @Override
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
