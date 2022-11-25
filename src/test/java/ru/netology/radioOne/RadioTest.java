package ru.netology.radioOne;

//import org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test //Выбор номера станции 1
    public void shouldSetNumStation() {
        Radio num = new Radio();
        num.setStation(1);
        int expected = 1;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Выбор номера станции больше 9
    public void shouldSetOverMaxNumStation() {
        Radio num = new Radio();
        num.setStation(10);
        int expected = 0;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Выбор номера станции меньше 0
    public void shouldSetUnderMinNumStation() {
        Radio num = new Radio();
        num.setStation(-1);
        int expected = 0;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Нажатие кнопки "Следующая станция" при текущей в пределах от 0 до 9
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
    @Test //Ввод громкости на 6
    public void shouldSetVolume() {
        Radio num = new Radio();
        num.setVolume(6);
        int expected = 6;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Ввод громкости 13
    public void shouldSetOverMaxVolume() {
        Radio num = new Radio();
        num.setVolume(13);
        int expected = 0;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Ввод громкости -3
    public void shouldSetUnderMinVolume() {
        Radio num = new Radio();
        num.setVolume(-3);
        int expected = 0;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Увеличение громкости при текущем значении 3
    public void shouldSetMoreVolume() {
        Radio num = new Radio();
        num.setVolume(3);
        num.nextVolume();
        int expected = 4;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Увеличение громкости при текущем значении 10 (максимум)
    public void shouldSetMoreMaxVolume() {
        Radio num = new Radio();
        num.setVolume(10);
        num.nextVolume();
        int expected = 10;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости при текущем значении 7
    public void shouldSetLessVolume() {
        Radio num = new Radio();
        num.setVolume(7);
        num.prevVolume();
        int expected = 6;
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

    @Test //Уменьшение громкости при текущем значении -2 (Тест для 100% покрытия BRANCH)
    public void shouldSetLessVolumeLess0() {
        Radio num = new Radio();
        num.setVolume(-2);
        num.prevVolume();
        int expected = 0;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости при текущем значении 12 (Тест для 100% покрытия BRANCH)
    public void shouldSetLessVolumeMore10() {
        Radio num = new Radio();
        num.setVolume(12);
        num.prevVolume();
        int expected = 0;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }
}