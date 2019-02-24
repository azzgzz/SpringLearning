package ru.azz.robotpool;

import ru.azz.robotinterfaces.Robot;
import ru.azz.robotinterfaces.RobotPool;

import java.util.Map;

public class T1000Pool implements RobotPool {
    private Map<String, Robot> robotCollection;

    public T1000Pool(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void setRobotCollection(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Map<String, Robot> getRobotPool() {
        return null;
    }

    public void beginShow() {
        for (Map.Entry<String,Robot> entry : robotCollection.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().action();
        }
    }
}
