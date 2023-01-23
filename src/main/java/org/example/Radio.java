package org.example;

public class Radio {
    private int quantity = 10;
    private int minNumberRadio = 0;
    private int maxNumberRadio = 9;
    private int numberRadio = minNumberRadio;
    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int quantity) {
        this.quantity = quantity;
        maxNumberRadio = quantity - 1;
    }

    public Radio() {

    }

    public int getNumberRadio() {
        return numberRadio;
    }

    public int getMinNumberRadio() {
        return minNumberRadio;
    }

    public int getMaxNumberRadio() {
        return maxNumberRadio;
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio > maxNumberRadio) {
            return;
        }
        if (newNumberRadio < minNumberRadio) {
            return;
        }
        numberRadio = newNumberRadio;
    }

    public void increaseNumberRadio() {
        int target = numberRadio + 1;
        if (target > maxNumberRadio) {
            target = minNumberRadio;
        }
        numberRadio = target;

    }

    public void decreaseNumberRadio() {
        int target = numberRadio - 1;
        if (target < minNumberRadio) {
            target = maxNumberRadio;
        }
        numberRadio = target;
    }

    public void setVolume(int newVolume) {
        if (newVolume > maxVolume) {
            return;
        }
        if (newVolume < minVolume) {
            return;
        }
        volume = newVolume;
    }


    public void increaseVolume() {
        int target = volume + 1;
        if (target > maxVolume) {
            target = maxVolume;
        }
        volume = target;

    }

    public void decreaseVolume() {
        int target = volume - 1;
        if (target < minVolume) {
            target = minVolume;
        }
        volume = target;
    }


}
