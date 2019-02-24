package ru.azz.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.azz.robotinterfaces.Hand;

@Component
@Lazy
public class ToshibaHand implements Hand {
    @Override
    public void catchSmth() {
        System.out.println("Toshiba catches miyatzuki!!!");
    }
}
