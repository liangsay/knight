package com.springinaction.knights;

import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * Created by liujinliang on 2017/8/16.
 */
public class BraceKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }
}
