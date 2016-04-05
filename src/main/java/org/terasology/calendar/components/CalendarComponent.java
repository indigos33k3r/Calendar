package org.terasology.calendar.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.terasology.calendar.components.internal.HolidayInitComponent;
import org.terasology.calendar.components.internal.MonthInitComponent;
import org.terasology.calendar.components.internal.SeasonInitComponent;
import org.terasology.calendar.components.internal.WeekdayInitComponent;
import org.terasology.entitySystem.Component;

public class CalendarComponent implements Component {
    private int daysPerMonth;
    private String name;

    private List<HolidayInitComponent> holidays;
    private List<MonthInitComponent> months;
    private List<SeasonInitComponent> seasons;
    private List<WeekdayInitComponent> weekdays;

    private CalendarComponent() {
        holidays = new ArrayList<>();
        months = new ArrayList<>();
        seasons = new ArrayList<>();
        weekdays = new ArrayList<>();
    }

    public CalendarComponent(int monthLength, String calendarName, List<HolidayInitComponent> holidayList, List<MonthInitComponent> monthList, List<SeasonInitComponent> seasonList, List<WeekdayInitComponent> weekdayList) {
        daysPerMonth = monthLength;
        name = calendarName;

        holidays = holidayList;
        months = monthList;
        seasons = seasonList;
        weekdays = weekdayList;
   }

    public int getDaysPerMonth() {
        return daysPerMonth;
    }

    public String getName() {
        return name;
    }

    public List<HolidayInitComponent> getHolidays() {
        if ( holidays == null ) { return Collections.EMPTY_LIST; }
        return holidays;
    }

    public Iterator<HolidayInitComponent> getHolidayIterator() {
        return getHolidays().iterator();
    }

    public List<MonthInitComponent> getMonths() {
        if ( months == null ) { return Collections.EMPTY_LIST; }
        return months;
    }

    public Iterator<MonthInitComponent> getMonthIterator() {
        return getMonths().iterator();
    }

    public List<SeasonInitComponent> getSeasons() {
        if ( seasons == null ) { return Collections.EMPTY_LIST; }
        return seasons;
    }

    public Iterator<SeasonInitComponent> getSeasonIterator() {
        return getSeasons().iterator();
    }

    public List<WeekdayInitComponent> getWeekdays() {
        if ( weekdays == null ) { return Collections.EMPTY_LIST; }
        return weekdays;
    }

    public Iterator<WeekdayInitComponent> getWeekdayIterator() {
        return getWeekdays().iterator();
    }
}
