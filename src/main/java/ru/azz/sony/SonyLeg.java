package ru.azz.sony;

import ru.azz.robotinterfaces.Leg;

public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Sony goes goes around!");
    }
}
