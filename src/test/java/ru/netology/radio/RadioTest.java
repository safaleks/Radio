package ru.netology.radio;

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
        num.nextStation(5);
        int expected = 6;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Нажатие кнопки "Следующая станция" при текущей станции 9
    public void shouldNextMaxNumStation() {
        Radio num = new Radio();
        num.nextStation(9);
        int expected = 0;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Нажатие кнопки "Следующая станция" при текущей станции -2 (Тест для 100% покрытия BRANCH)
    public void shouldNextNumStationLess0() {
        Radio num = new Radio();
        num.nextStation(-2);
        int expected = 0;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Нажатие кнопки "Предыдущая станция" при текущей станции 4
    public void shouldPrevNumStation() {
        Radio num = new Radio();
        num.prevStation(4);
        int expected = 3;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Нажатие кнопки "Предыдущая станция" при текущей станции 0
    public void shouldPrevMinNumStation() {
        Radio num = new Radio();
        num.prevStation(0);
        int expected = 9;
        int actual = num.getStation();
        assertEquals(expected, actual);
    }

    @Test //Нажатие кнопки "Предыдущая станция" при текущей станции 12 (Тест для 100% покрытия BRANCH)
    public void shouldPrevNumStationMore9() {
        Radio num = new Radio();
        num.prevStation(12);
        int expected = 0;
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
        num.nextVolume(3);
        int expected = 4;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Увеличение громкости при текущем значении 10 (максимум)
    public void shouldSetMoreMaxVolume() {
        Radio num = new Radio();
        num.nextVolume(10);
        int expected = 10;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Увеличение громкости при текущем значении -2 (Тест для 100% покрытия BRANCH)
    public void shouldSetMoreVolumeLess0() {
        Radio num = new Radio();
        num.nextVolume(-2);
        int expected = 0;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости при текущем значении 7
    public void shouldSetLessVolume() {
        Radio num = new Radio();
        num.prevVolume(7);
        int expected = 6;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости при текущем значении 0 (минимум)
    public void shouldSetLessMinVolume() {
        Radio num = new Radio();
        num.prevVolume(0);
        int expected = 0;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости при текущем значении -2 (Тест для 100% покрытия BRANCH)
    public void shouldSetLessVolumeLess0() {
        Radio num = new Radio();
        num.prevVolume(-2);
        int expected = 0;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости при текущем значении 12 (Тест для 100% покрытия BRANCH)
    public void shouldSetLessVolumeMore10() {
        Radio num = new Radio();
        num.prevVolume(12);
        int expected = 0;
        int actual = num.getVolume();
        assertEquals(expected, actual);
    }
}
