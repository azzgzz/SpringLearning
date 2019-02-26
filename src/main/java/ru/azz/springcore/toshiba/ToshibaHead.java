package ru.azz.springcore.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.azz.springcore.robotinterfaces.Head;

@Component
@Lazy
public class ToshibaHead implements Head {
    @Override
    public void calc() {
        System.out.println("Toshiba thinks that he smart");
    }
}
