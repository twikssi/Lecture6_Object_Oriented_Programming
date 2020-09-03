package by.andrey.twikss.exe4tvandtvcontroller.service;

import by.andrey.twikss.exe3tv.bean.Tv;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TvControllerTest {
    Tv tv;
    TvController tvController;

    @Before
    public void setUp(){
        tv = new Tv(1,50,"БеларусийПраудаЯшчык");
        tvController = new TvController();
    }

    @Test
    public void getTvReturnTv() {
        tvController.setTv(tv);

       Tv expected = tv;
       Tv actual = tvController.getTv();

       assertEquals(expected,actual);
    }

    @Test
    public void getTvReturnTrue() {
        tvController.setTv(tv);

       boolean expected = true;
       boolean actual = tvController.getTv().equals(tv);

        assertEquals(expected,actual);
    }


    @Test
    public void turnOnTv() {
        tvController.setTv(tv);
        tvController.turnOnTv();

        boolean expected = true;
        boolean actual = tv.isSwitchTV();

        assertEquals(expected,actual);
    }

    @Test
    public void turnOffTv() {
        tvController.setTv(tv);
        tvController.turnOnTv();
        tvController.turnOffTv();

        boolean expected = false;
        boolean actual = tv.isSwitchTV();

        assertEquals(expected,actual);
    }

    @Test
    public void turnUpVolume() {
        tvController.setTv(tv);
        tvController.turnOnTv();
        tvController.turnUpVolume();
        tvController.turnUpVolume();
        tvController.turnUpVolume();
        tvController.turnUpVolume();

        int expected = 54;
        int actual = tv.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    public void turnDownVolume() {
        tvController.setTv(tv);
        tvController.turnOnTv();
        tvController.turnDownVolume();
        tvController.turnDownVolume();
        tvController.turnDownVolume();
        tvController.turnDownVolume();
        tvController.turnOffTv();
        tvController.turnDownVolume();
        tvController.turnDownVolume();

        int expected = 46;
        int actual = tv.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    public void switchChannelIncrease() {
        tvController.setTv(tv);
        tvController.turnOnTv();
        tvController.switchChannelIncrease();
        tvController.switchChannelIncrease();
        tvController.switchChannelIncrease();
        tvController.switchChannelIncrease();
        tvController.switchChannelIncrease();
        tvController.switchChannelIncrease();
        tvController.switchChannelIncrease();


        int expected = 8;
        int actual = tv.getCurrentChannel();

        assertEquals(expected,actual);
    }

    @Test
    public void switchChannelDecrease() {
        tvController.setTv(tv);
        tvController.turnOnTv();
        tv.setCurrentChannel(55);
        tvController.switchChannelDecrease();
        tvController.switchChannelDecrease();
        tvController.switchChannelDecrease();
        tvController.switchChannelDecrease();
        tvController.switchChannelDecrease();
        tvController.switchChannelDecrease();


        int expected = 49;
        int actual = tv.getCurrentChannel();

        assertEquals(expected,actual);
    }
}