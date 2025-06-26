package ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service;

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;

    public void setStation(int newStation) {
        if (newStation < 0 || newStation > 9) {
            return;
        }
        this.currentRadioStation = newStation;
    }

    public int getStation() {
        return currentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prevStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation--;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            currentSoundVolume = 0;
        } else if (newVolume > 100) {
            currentSoundVolume = 100;
        } else {
            currentSoundVolume = newVolume;
        }
    }

    public int getVolume() {
        return currentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        }
    }
}