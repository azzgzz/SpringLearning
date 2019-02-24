package ru.azz.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.azz.robotinterfaces.Head;

@Component
@Lazy
public class ToshibaHead implements Head {
    @Override
    public void calc() {
        System.out.println("Toshiba thinks that he smart");
    }
}
