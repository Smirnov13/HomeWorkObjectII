package ru.netology.HomeWorkObjectII;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentWave(5);
        radio.next();
        Assertions.assertEquals(6, radio.getCurrentWave());
    }

    @Test
    public void testNextBoundary() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentWave());
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();
        radio.setCurrentWave(3);
        radio.prev();
        Assertions.assertEquals(2, radio.getCurrentWave());
    }

    @Test
    public void testPrevBoundary() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentWave());
    }

    @Test
    public void testSetCurrentWaveValid() {
        Radio radio = new Radio();
        radio.setCurrentWave(7);
        Assertions.assertEquals(7, radio.getCurrentWave());
    }

    @Test
    public void testSetCurrentWaveInvalidUp() {
        Radio radio = new Radio();
        radio.setCurrentWave(11);
        Assertions.assertEquals(0, radio.getCurrentWave());
    }

    @Test
    public void testSetCurrentWaveInvalidDown() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);
        Assertions.assertEquals(0, radio.getCurrentWave());
    }

    //
    @Test
    public void testSetCurrentVolumeValid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(37);
        Assertions.assertEquals(37, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeInvalidUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(111);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeInvalidDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    //

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
//        int expected = 100;
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void testDecreaseVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}