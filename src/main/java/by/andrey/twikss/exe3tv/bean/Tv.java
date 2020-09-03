package by.andrey.twikss.exe3tv.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Tv {
    private Logger logger = LoggerFactory.getLogger(Tv.class);
    private int currentChannel;
    private int currentVolume;
    private String company;
    private boolean switchTV = false;

    public Tv(int currentChannel, int currentVolume, String company) {
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
        this.company = company;
    }

    public void switchChannelIncrease (){
        if (isSwitchTV()){
            this.currentChannel += 1;
        } else {
            logger.info("Tv has turned off");
        }
    }

    public void switchChannelDecrease (){
        if (isSwitchTV()){
            this.currentChannel -= 1;
        } else {
            logger.info("Tv has turned off");
        }
    }

    public void turnUpVolume (){
        if (isSwitchTV()){
            this.currentVolume += 1;
        } else {
            logger.info("Tv has turned off");
        }
    }

    public void turnDownVolume (){
        if (isSwitchTV()){
            this.currentVolume -= 1;
        } else {
            logger.info("Tv has turned off");
        }
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSwitchTV(boolean switchTV) {
        this.switchTV = switchTV;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getCompany() {
        return company;
    }

    public boolean isSwitchTV() {
        return switchTV;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                switchTV == tv.switchTV &&
                Objects.equals(company, tv.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, company, switchTV);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", company='" + company + '\'' +
                ", switchTV=" + switchTV +
                '}';
    }
}
