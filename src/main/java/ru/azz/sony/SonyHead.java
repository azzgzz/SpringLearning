package ru.azz.sony;

import ru.azz.robotinterfaces.Head;

public class SonyHead implements Head {
    @Override
    public void calc() {
        System.out.println("Sony calculated!");
    }
}
