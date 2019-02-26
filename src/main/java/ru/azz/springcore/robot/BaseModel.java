package ru.azz.springcore.robot;

import org.springframework.beans.factory.annotation.Autowired;
import ru.azz.springcore.robotinterfaces.Hand;
import ru.azz.springcore.robotinterfaces.Head;
import ru.azz.springcore.robotinterfaces.Leg;
import ru.azz.springcore.robotinterfaces.Robot;

public abstract class BaseModel implements Robot {
    @Autowired
    private Hand hand;
    @Autowired
    private Leg leg;
    @Autowired
    private Head head;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor");
    }

    public BaseModel(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        System.out.println(this + " - BaseModel 3 args constructor");
    }

    public Hand getHand() {
        return hand;
    }


    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }


    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }


    public void setHead(Head head) {
        this.head = head;
    }
}
