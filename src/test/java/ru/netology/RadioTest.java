package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurVolume(5);

        int expected = 6;
        int actual;

        radio.increaseVolume();

        actual = radio.getCurVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeHigherThanMax() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurVolume(10);

        int expected = 10;
        int actual;

        radio.increaseVolume();

        actual = radio.getCurVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurVolume(5);

        int expected = 4;
        int actual;

        radio.decreaseVolume();

        actual = radio.getCurVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeLowerThanMin() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurVolume(0);

        int expected = 0;
        int actual;

        radio.decreaseVolume();

        actual = radio.getCurVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseChannelNum() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurChannelNum(5);

        int expected = 6;
        int actual;

        radio.increaseChannelNum();

        actual = radio.getCurChannelNum();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseChannelNumHigherThanMax() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurChannelNum(9);

        int expected = 0;
        int actual;

        radio.increaseChannelNum();

        actual = radio.getCurChannelNum();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseChannelNum() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurChannelNum(5);

        int expected = 4;
        int actual;

        radio.decreaseChannelNum();

        actual = radio.getCurChannelNum();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseChannelNumLowerThanMin() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurChannelNum(0);

        int expected = 9;
        int actual;

        radio.decreaseChannelNum();

        actual = radio.getCurChannelNum();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetChannelNUm() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurChannelNum(1);

        radio.setCurChannelNum(2);

        int expected = 2;
        int actual;

        actual = radio.getCurChannelNum();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetInvalidHighChannelNum() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurChannelNum(1);

        radio.setCurChannelNum(25);

        int expected = 1;
        int actual;

        actual = radio.getCurChannelNum();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetInvalidLowChannelNum() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurChannelNum(1);

        radio.setCurChannelNum(-50);

        int expected = 1;
        int actual;

        actual = radio.getCurChannelNum();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetInvalidHighVolume() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurVolume(4);

        radio.setCurVolume(25);

        int expected = 4;
        int actual;

        actual = radio.getCurVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetInvalidLowVolume() {
        Radio radio = new Radio();

        radio.setMaxChannelNum(9);
        radio.setMinChannelNum(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurVolume(4);

        radio.setCurVolume(-5);

        int expected = 4;
        int actual;

        actual = radio.getCurVolume();

        assertEquals(expected, actual);
    }
}
