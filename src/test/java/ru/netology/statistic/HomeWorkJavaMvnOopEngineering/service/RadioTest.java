package ru.netology.statistic.HomeWorkJavaMvnOopEngineering.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldSetStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        assertEquals(5, radio.getStation());
    }

    @Test
    void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setStation(-1);
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setStation(10);
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.nextStation();
        assertEquals(6, radio.getStation());
    }

    @Test
    void shouldSwitchToFirstStationAfterLast() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSwitchToPrevStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.prevStation();
        assertEquals(4, radio.getStation());
    }

    @Test
    void shouldSwitchToLastStationAfterFirst() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prevStation();
        assertEquals(9, radio.getStation());
    }

    @Test
    void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        assertEquals(50, radio.getVolume());
    }

    @Test
    void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setVolume(101);
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getVolume());
    }

    @Test
    void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
}