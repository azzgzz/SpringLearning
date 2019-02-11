package ru.azz.robot;

import ru.azz.robotinterfaces.Hand;
import ru.azz.robotinterfaces.Head;
import ru.azz.robotinterfaces.Leg;
import ru.azz.robotinterfaces.Robot;

public class ModelT1000 implements Robot {

    private Hand hand;
    private Head head;
    private Leg leg;

    private String color;
    private int year;
    private boolean soundEnable;


    public ModelT1000(){}

    public ModelT1000(Hand hand, Head head, Leg leg){
        super();
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public ModelT1000(Hand hand, Head head, Leg leg, String color, int year, boolean soundEnable) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public ModelT1000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSmth();
        leg.go();
        System.out.println("colot: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnable);
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }

    public void initObject (){
        System.out.println("init");
    }

    public void destroyObject(){
        System.out.println("destroy");
    }
}
