package ru.azz.springcore.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.azz.springcore.robotinterfaces.Leg;

@Component
@Lazy
public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Toshiba going to the moon!");
    }
}
