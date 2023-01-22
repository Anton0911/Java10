package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNumberRadio() {
        Radio action = new Radio();
        action.setNumberRadio(5);
        int expected = 5;
        int actual = action.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxNumberRadio() {
        Radio action = new Radio();
        action.setNumberRadio(20);
        int expected = 0;
        int actual = action.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLessMinNumberRadio() {
        Radio action = new Radio();
        action.setNumberRadio(-1);
        int expected = 0;
        int actual = action.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNexMoreMaxNumberRadio() {
        Radio action = new Radio();
        action.setNumberRadio(9);
        action.increaseNumberRadio();
        int expected = 0;
        int actual = action.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNexNumberRadio() {
        Radio action = new Radio();
        action.setNumberRadio(0);
        action.increaseNumberRadio();
        int expected = 1;
        int actual = action.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevMoreMinNumberRadio() {
        Radio action = new Radio();
        action.setNumberRadio(0);
        action.decreaseNumberRadio();
        int expected = 9;
        int actual = action.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberRadio() {
        Radio action = new Radio();
        action.setNumberRadio(9);
        action.decreaseNumberRadio();
        int expected = 8;
        int actual = action.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNexMoreMaxVolume() {
        Radio action = new Radio();
        action.volume = 10;
        action.increaseVolume();
        int expected = 0;
        int actual = action.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNexVolume() {
        Radio action = new Radio();
        action.volume = 5;
        action.increaseVolume();
        int expected = 6;
        int actual = action.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMoreMinVolume() {
        Radio action = new Radio();
        action.volume = 0;
        action.decreaseVolume();
        int expected = 10;
        int actual = action.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume() {
        Radio action = new Radio();
        action.volume = 5;
        action.decreaseVolume();
        int expected = 4;
        int actual = action.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}
