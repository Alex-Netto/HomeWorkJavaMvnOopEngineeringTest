package ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service;

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        } else {
            if (newStation > 9) {
                return;
            } else {
                this.currentRadioStation = newStation;
            }
        }
    }

    public int getStation() {
        return this.currentRadioStation;
    }

    public void nextStation() {
        if (this.currentRadioStation == 9) {
            this.currentRadioStation = 0;
        } else {
            if (this.currentRadioStation != 9) {
                this.currentRadioStation = this.currentRadioStation + 1;
            }
        }
    }

    public void prevStation() {
        if (this.currentRadioStation == 0) {
            this.currentRadioStation = 9;
        } else {
            if (this.currentRadioStation != 0) {
                this.currentRadioStation = this.currentRadioStation - 1;
            }
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            this.currentSoundVolume = 0;
        } else {
            if (newVolume > 100) {
                this.currentSoundVolume = 100;
            } else {
                if (newVolume >= 0 && newVolume <= 100) {
                    this.currentSoundVolume = newVolume;
                }
            }
        }
    }

    public int getVolume() {
        return this.currentSoundVolume;
    }

    public void increaseVolume() {
        if (this.currentSoundVolume < 100) {
            this.currentSoundVolume = this.currentSoundVolume + 1;
        } else {
            if (this.currentSoundVolume >= 100) {
                this.currentSoundVolume = 100;
            }
        }
    }

    public void decreaseVolume() {
        if (this.currentSoundVolume > 0) {
            this.currentSoundVolume = this.currentSoundVolume - 1;
        } else {
            if (this.currentSoundVolume <= 0) {
                this.currentSoundVolume = 0;
            }
        }
    }
}