package ru.azz.springcore.sony;

import ru.azz.springcore.robotinterfaces.Head;

public class SonyHead implements Head {
    @Override
    public void calc() {
        System.out.println("Sony calculated!");
    }
}
