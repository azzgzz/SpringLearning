package ru.azz.springcore.sony;

import ru.azz.springcore.robotinterfaces.Hand;

public class SonyHand implements Hand {
    @Override
    public void catchSmth() {
        System.out.println("Sony catch ARBUZ!");
    }
}
