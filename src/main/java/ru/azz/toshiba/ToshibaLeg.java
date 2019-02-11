package ru.azz.toshiba;

import ru.azz.robotinterfaces.Leg;

public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Toshiba going to the moon!");
    }
}
