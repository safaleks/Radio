package ru.netology.radio;

public class Radio {
    public int station;
    public int volume;

    //Номер радиостанции
    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        station = newStation;
    }

    public void nextStation(int nextStation) {
        if (nextStation >= 0 && nextStation < 9) {
            station = nextStation + 1;
        }
        if (nextStation == 9) {
            station = 0;
        }
        station = getStation();
    }

    public void prevStation(int prevStation) {
        if (prevStation > 0 && prevStation <= 9) {
            station = prevStation - 1;
        }
        if (prevStation == 0) {
            station = 9;
        }
        station = getStation();
    }

    //Громкость
    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }

    public void nextVolume(int nextVolume) {
        if (nextVolume >= 0 && nextVolume < 10) {
            volume = nextVolume + 1;
        }
        if (nextVolume == 10) {
            volume = 10;
        }
        volume = getVolume();
    }

    public void prevVolume(int prevVolume) {
        if (prevVolume > 0 && prevVolume <= 10) {
            volume = prevVolume - 1;
        }
        if (prevVolume == 0) {
            volume = 0;
        }
        volume = getVolume();
    }
}
