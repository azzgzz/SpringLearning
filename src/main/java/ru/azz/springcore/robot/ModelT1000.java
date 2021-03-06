package ru.azz.springcore.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.azz.springcore.robotinterfaces.Hand;
import ru.azz.springcore.robotinterfaces.Head;
import ru.azz.springcore.robotinterfaces.Leg;

import java.lang.reflect.Method;

@Component
public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean, MethodReplacer {

    private String color;
    private int year;
    private boolean soundEnable;

    public ModelT1000(){
        super();
        System.out.println(this + " - ModelT1000 empty constructor");}

    public ModelT1000(Hand hand, Leg leg, Head head){
        super(hand, leg, head);
        System.out.println(this + " - ModelT1000 3 args constructor");
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnable) {
        super(hand, leg, head);
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
        System.out.println(this + " - ModelT1000 6 args constructor");
    }

    public ModelT1000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }



    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model1() {
        return new ModelT1000();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model2() {
        return new ModelT1000("Black", 2005, true);
    }

    @Override
    public void action() {
        getHead().calc();
        getHand().catchSmth();
        getLeg().go();
        System.out.println("colot: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnable);
        System.out.println();
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
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

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return this;
    }
}
