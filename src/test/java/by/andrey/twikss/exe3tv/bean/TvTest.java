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
        String expected = "Tv{currentChanal=1, currentVolume=50, company='БеларускийПраудаЯшчык', switchTV=false}";
        String actual = tv.toString();

        assertEquals(expected,actual);
    }
}