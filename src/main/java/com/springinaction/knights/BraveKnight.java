package com.springinaction.knights;

/**
 * Created by liujinliang on 2017/8/16.
 */
public class BraveKnight implements Knight {
    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }


    public void embarkOnQuest(){
        quest.embark();
    }
}
