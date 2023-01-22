package org.example;

public class Radio {
    public int numberRadio;

    public int getNumberRadio() {
        return numberRadio;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio > 9) {
            return;
        }
        if (newNumberRadio < 0) {
            return;
        }
        numberRadio = newNumberRadio;
    }

    public void increaseNumberRadio() {
        int target = numberRadio + 1;
        if (target > 9) {
            target = 0;
        }
        numberRadio = target;

    }

    public void decreaseNumberRadio() {
        int target = numberRadio - 1;
        if (target < 0) {
            target = 9;
        }
        numberRadio = target;
    }

    public int volume;

    public int getVolume() {
        return volume;
    }


    public void increaseVolume() {
        int target = volume + 1;
        if (target > 10) {
            target = 0;
        }
        volume = target;

    }

    public void decreaseVolume() {
        int target = volume - 1;
        if (target < 0) {
            target = 10;
        }
        volume = target;
    }


}
