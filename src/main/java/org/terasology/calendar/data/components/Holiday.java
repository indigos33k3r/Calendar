package org.terasology.calendar.data.components;

import org.terasology.entitySystem.Component;

public class Holiday implements Component {

    private int day;
    private int length;
    private int month;

    private String name;

    private Holiday() {
    }

    public Holiday(int calendarDay, int calendarMonth, int days, String calendarName) {
        day = calendarDay;
        month = calendarMonth;
        length = days;
        name = calendarName;
    }

     public int getDay() {
        return day;
    }

    public int getLength() {
        return length;
    }

   public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}
