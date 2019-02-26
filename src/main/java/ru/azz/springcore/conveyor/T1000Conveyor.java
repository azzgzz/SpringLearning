package ru.azz.springcore.conveyor;

import ru.azz.springcore.robotinterfaces.Robot;
import ru.azz.springcore.robotinterfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor {
    @Override
    public abstract Robot createRobot();

}
