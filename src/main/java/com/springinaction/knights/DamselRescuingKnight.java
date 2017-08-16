package com.springinaction.knights;

/**
 * Created by liujinliang on 2017/8/16.
 */
public class DamselRescuingKnight implements Knight {


    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
