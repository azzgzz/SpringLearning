package ru.azz.sony;

import ru.azz.robotinterfaces.Hand;

public class SonyHand implements Hand {
    @Override
    public void catchSmth() {
        System.out.println("Sony catch ARBUZ!");
    }
}
