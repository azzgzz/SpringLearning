package ru.azz.springcore.sony;

import ru.azz.springcore.robotinterfaces.Leg;

public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Sony goes goes around!");
    }
}
