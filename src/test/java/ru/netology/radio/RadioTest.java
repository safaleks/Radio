package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test //Выбор номера станции 29
    public void shouldSetCountStation() {
        Radio num = new Radio(30);
        num.setStation(29);
        int expected = 29;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Выбор номера станции 9
    public void shouldSetNumStation() {
        Radio num = new Radio();
        num.setStation(9);
        int expected = 9;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Выбор номера станции 10 (Нельзя)
    public void shouldSetOverMaxNumStation() {
        Radio num = new Radio();
        num.setStation(10);
        int expected = 0;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Выбор номера станции меньше 0 (Нельзя)
    public void shouldSetUnderMinNumStation() {
        Radio num = new Radio();
        num.setStation(-1);
        int expected = 0;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Нажатие кнопки "Следующая станция" при текущей 5
    public void shouldNextNumStation() {
        Radio num = new Radio();
        num.setStation(5);
        num.nextStation();
        int expected = 6;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Нажатие кнопки "Следующая станция" при текущей станции 9
    public void shouldNextMaxNumStation() {
        Radio num = new Radio();
        num.setStation(9);
        num.nextStation();
        int expected = 0;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Нажатие кнопки "Предыдущая станция" при текущей станции 4
    public void shouldPrevNumStation() {
        Radio num = new Radio();
        num.setStation(4);
        num.prevStation();
        int expected = 3;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Нажатие кнопки "Предыдущая станция" при текущей станции 0
    public void shouldPrevMinNumStation() {
        Radio num = new Radio();
        num.setStation(0);
        num.prevStation();
        int expected = 9;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    //Тесты на громкость
    @Test //Ввод громкости на 66
    public void shouldSetVolume() {
        Radio num = new Radio();
        num.setVolume(66);
        int expected = 66;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Ввод громкости 135 (Нельзя)
    public void shouldSetOverMaxVolume() {
        Radio num = new Radio();
        num.setVolume(135);
        int expected = 0;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Ввод громкости -3 (Нельзя)
    public void shouldSetUnderMinVolume() {
        Radio num = new Radio();
        num.setVolume(-3);
        int expected = 0;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Ввод громкости 100 (максимум)
    public void shouldSetMoreMaxVolume() {
        Radio num = new Radio();
        num.setVolume(100);
        int expected = 100;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Увеличение громкости при текущем значении 100 (Максимум)
    public void shouldSetMoreVolumeLess0() {
        Radio num = new Radio();
        num.setVolume(100);
        num.nextVolume();
        int expected = 100;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Увеличение громкости при текущем значении 31
    public void shouldSetOverVolume() {
        Radio num = new Radio();
        num.setVolume(31);
        num.nextVolume();
        int expected = 32;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости при текущем значении 0 (минимум)
    public void shouldSetLessMinVolume() {
        Radio num = new Radio();
        num.setVolume(0);
        num.prevVolume();
        int expected = 0;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости при текущем значении 45
    public void shouldSetLessVolumeMore10() {
        Radio num = new Radio();
        num.setVolume(45);
        num.prevVolume();
        int expected = 44;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }
}
