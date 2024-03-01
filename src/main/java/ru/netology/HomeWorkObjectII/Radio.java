package ru.netology.HomeWorkObjectII;

public class Radio {


    private int currentWave;
    private int currentVolume;

    public int getCurrentWave() {

        return currentWave;
    }

    public void next() {
        if (currentWave == 9) {
            currentWave = 0;
        } else {
            currentWave = currentWave + 1;
        }
    }

    public void prev() {
        if (currentWave == 0) {
            currentWave = 9;
        } else {
            currentWave = currentWave - 1;
        }
    }

    public void setCurrentWave(int newWave) {
        if (newWave >= 0 && newWave <= 9) {
            currentWave = newWave;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }
    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            currentVolume = newVolume;
        }
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

