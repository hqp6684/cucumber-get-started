
package io.cucumber;

public class Belly {

    private int cukes;
    private String sound;
    private int waitedTime;

    public Belly() {

    }

    public void setCuke(int cukes) {
        this.cukes = cukes;
    }

    public void waitFor(int hours) {
        waitedTime = hours;
        sound = hours >= 5 ? "growlll" : "silent";
    }

    public String getSound() {
        return sound;
    }

    public int getWaitedTime() {
        return waitedTime;
    }

}