package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radiomanTest {

    @Test
    public void increaseVolume() {
        radioman radioman = new radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(5);
        radioman.increaseVolume();
        int expected = 6;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void increaseVolumeMin() {
        radioman radioman = new radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(0);
        radioman.increaseVolume();
        int expected = 0;

        assertEquals(expected, radioman.getMinVolume());
    }

    @Test
    public void increaseVolumeMax() {
        radioman radioman = new radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(10);
        radioman.increaseVolume();
        int expected = 10;

        assertEquals(expected, radioman.getMaxVolume());
    }

    @Test
    public void decreaseVolumeMin() {
        radioman radioman = new radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(0);
        radioman.decreaseVolume();
        int expected = 0;

        assertEquals(expected, radioman.getMinVolume());
    }

    @Test
    public void decreaseVolumeMax() {
        radioman radioman = new radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(10);
        radioman.decreaseVolume();
        int expected = 10;

        assertEquals(expected, radioman.getMaxVolume());
    }

    @Test
    public void decreaseVolume() {
        radioman radioman = new radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(5);
        radioman.decreaseVolume();
        int expected = 4;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume() {
        radioman radioman = new radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(5);
        int expected = 5;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeMin() {
        radioman radioman = new radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(0);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeMax() {
        radioman radioman = new radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(10);
        int expected = 10;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUnder() {
        radioman radioman = new radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(-1);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOver() {
        radioman radioman = new radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(15);
        int expected = 10;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void nextRadioStation() {
        radioman radioman = new radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(6);
        radioman.nextRadioStation();
        int expected = 7;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        radioman radioman = new radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(6);
        radioman.prevRadioStation();
        int expected = 5;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStation() {
        radioman radioman = new radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(6);
        int expected = 6;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationMax() {
        radioman radioman = new radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(0);
        radioman.prevRadioStation();
        int expected = 9;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMin() {
        radioman radioman = new radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(9);
        radioman.nextRadioStation();
        int expected = 0;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationUnder() {
        radioman radioman = new radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(-1);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationOver() {
        radioman radioman = new radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(15);
        int expected = 9;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }
}