package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by liujinliang on 2017/8/16.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!!!");
    }
}
