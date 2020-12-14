package com.example.azkar;

import junit.framework.TestCase;

import org.junit.Test;

public class DataManagerTest extends TestCase {


    // This is to test whether the return zikr is the one we need or not.
    // I know, it's not much but, this is all I can do for now, since I haven't added any deep
    // Stuff to the app yet.
    @Test
    public void testAChosenZikr() {
        DataManager dm = DataManager.getInstance();

        String zikrMessage = "بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم\n" +
                "قُلْ أَعُوذُ بِرَبِّ النَّاسِ، مَلِكِ النَّاسِ، إِلَٰهِ النَّاسِ، مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ، الَّذِى يُوَسْوِسُ فِى صُدُورِ النَّاسِ، مِنَ الْجِنَّةِ وَالنَّاسِ";

        Zikr zikr = dm.getMasaaZikr().get(4);

        assertEquals(zikrMessage, zikr.getZikrText());
    }

}