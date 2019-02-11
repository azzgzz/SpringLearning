package ru.azz.toshiba;

import ru.azz.robotinterfaces.Head;

public class ToshibaHead implements Head {
    @Override
    public void calc() {
        System.out.println("Toshiba thinks that he smart");
    }
}
