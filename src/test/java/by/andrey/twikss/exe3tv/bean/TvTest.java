package by.andrey.twikss.exe3tv.bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TvTest {
    Tv tv;

    @Before
    public void setUp(){
        tv = new Tv(1,50,"БеларускийПраудаЯшчык");
    }

    @Test
    public void testEqualsReturnFalse() {
        Tv tv2 = new Tv(1,50, "Sumsung");

        boolean expected = false;
        boolean actual = tv2.equals(tv);

        assertEquals(expected,actual);
    }

    @Test
    public void testEqualsReturnTrue() {
        Tv tv2 = new Tv(1,50, "БеларускийПраудаЯшчык");

        boolean expected = true;
        boolean actual = tv2.equals(tv);

        assertEquals(expected,actual);
    }

    @Test
    public void testHashCode() {
        int expected = -1896918960;
        int actual = tv.hashCode();

        assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        String expected = "Tv{currentChannel=1, currentVolume=50, company='БеларускийПраудаЯшчык', switchTV=false}";
        String actual = tv.toString();

        assertEquals(expected,actual);
    }

    @Test
    public void switchChannelIncreaseReturnNumber() {
        tv.setSwitchTV(true);
        tv.switchChannelIncrease();

        int expected = 2;
        int actual = tv.getCurrentChannel();

        assertEquals(expected,actual);
    }

    @Test
    public void switchChannelIncreaseReturnLog() {
        tv.switchChannelIncrease();
        tv.switchChannelIncrease();

        int expected = 1;
        int actual = tv.getCurrentChannel();

        assertEquals(expected,actual);
    }

    @Test
    public void switchChannelDecreaseReturnNumberChannel() {
        tv.setSwitchTV(true);
        tv.setCurrentChannel(54);
        tv.switchChannelDecrease();
        tv.switchChannelDecrease();

        int expected = 52;
        int actual = tv.getCurrentChannel();

        assertEquals(expected,actual);
    }

    @Test
    public void switchChannelDecreaseReturnLog() {
        tv.setSwitchTV(false);
        tv.setCurrentChannel(54);
        tv.switchChannelDecrease();
        tv.switchChannelDecrease();

        int expected = 54;
        int actual = tv.getCurrentChannel();

        assertEquals(expected,actual);
    }

    @Test
    public void turnUpVolumeReturnNumber() {
        tv.setSwitchTV(true);
        tv.turnUpVolume();
        tv.turnUpVolume();
        tv.turnUpVolume();
        tv.turnUpVolume();

        int expected = 54;
        int actual = tv.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    public void turnUpVolumeReturnLog() {
        tv.setSwitchTV(false);
        tv.turnUpVolume();
        tv.turnUpVolume();
        tv.turnUpVolume();
        tv.turnUpVolume();

        int expected = 50;
        int actual = tv.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    public void turnDownVolumeReturnNumber() {
        tv.setSwitchTV(true);
        tv.setCurrentVolume(68);
        tv.turnDownVolume();
        tv.turnDownVolume();
        tv.turnDownVolume();
        tv.turnDownVolume();

        int expected = 64;
        int actual = tv.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    public void turnDownVolumeReturnLog() {
        tv.setSwitchTV(false);
        tv.turnDownVolume();
        tv.turnDownVolume();
        tv.turnDownVolume();
        tv.turnDownVolume();

        int expected = 50;
        int actual = tv.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    public void setCompanyReturnTrue() {
        tv.setCompany("RussianBox");

        String expected = "RussianBox";
        String actual = tv.getCompany();

        assertEquals(expected,actual);
    }
}