package ru.netology.radio;

public class Radio {
    public int countStation; //количество радиостанций
    private int station; //номер текущей радиостанции
    private int volume; //значение громкости

    public Radio() {
        this.countStation = 10;
    }

    public Radio(int countStation) {
        this.countStation = countStation;
    }

    //Номер радиостанции
    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > countStation - 1) {
            return;
        }
        this.station = station;
    }

    public void nextStation() {
        if (station < countStation - 1) {
            station = station + 1;
        } else {
            station = 0;
        }
        station = getStation();
    }

    public void prevStation() {
        if (station > 0) {
            station = station - 1;
        } else {
            station = countStation - 1;
        }
        station = getStation();
    }

    //Громкость
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void nextVolume() {
        if (volume < 100) {
            volume = volume + 1;
        } else {
            volume = getVolume();
        }
    }

    public void prevVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
