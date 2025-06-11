package ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextStation() {
        ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio radio = new ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio();
        radio.setStation(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationZero() {
        ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio radio = new ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio();
        radio.setStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStation() {
        ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio radio = new ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio();
        radio.setStation(2);
        radio.prevStation();
        int expected = 1;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationZero() {
        ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio radio = new ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio();
        radio.setStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {
        ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio radio = new ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMax() {
        ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio radio = new ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume() {
        ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio radio = new ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio();
        radio.setVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMin() {
        ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio radio = new ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMax() {
        ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio radio = new ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio();
        radio.setStation(10);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationMin() {
        ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio radio = new ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service.Radio();
        radio.setStation(-1);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }
}  