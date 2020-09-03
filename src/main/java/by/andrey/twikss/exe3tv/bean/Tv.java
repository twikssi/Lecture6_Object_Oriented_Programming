package by.andrey.twikss.exe3tv.bean;

import java.util.Objects;

public class Tv {
    private int currentChanal;
    private int currentVolume;
    private String company;
    private boolean switchTV = false;

    public Tv(int currentChanal, int currentVolume, String company) {
        this.currentChanal = currentChanal;
        this.currentVolume = currentVolume;
        this.company = company;
    }

    public int getCurrentChanal() {
        return currentChanal;
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
        return currentChanal == tv.currentChanal &&
                currentVolume == tv.currentVolume &&
                switchTV == tv.switchTV &&
                Objects.equals(company, tv.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChanal, currentVolume, company, switchTV);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChanal=" + currentChanal +
                ", currentVolume=" + currentVolume +
                ", company='" + company + '\'' +
                ", switchTV=" + switchTV +
                '}';
    }
}
