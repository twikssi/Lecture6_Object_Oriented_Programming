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


}