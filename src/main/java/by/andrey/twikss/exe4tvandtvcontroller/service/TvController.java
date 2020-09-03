package by.andrey.twikss.exe4tvandtvcontroller.service;

import by.andrey.twikss.exe3tv.bean.Tv;

public class TvController {
    Tv tv;

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public void turnOnTv(){
        tv.setSwitchTV(true);
    }

    public void turnOffTv(){
        tv.setSwitchTV(false);
    }

    public void turnUpVolume(){
        tv.turnUpVolume();
    }
    public void turnDownVolume(){
        tv.turnDownVolume();
    }
}
