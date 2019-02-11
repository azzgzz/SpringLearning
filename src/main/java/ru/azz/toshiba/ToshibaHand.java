package ru.azz.toshiba;

import ru.azz.robotinterfaces.Hand;

public class ToshibaHand implements Hand {
    @Override
    public void catchSmth() {
        System.out.println("Toshiba catches miyatzuki!!!");
    }
}
