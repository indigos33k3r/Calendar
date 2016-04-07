/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.calendar.components;

import org.terasology.entitySystem.Component;
import org.terasology.reflection.MappedContainer;

@MappedContainer
public class SeasonComponent implements Component {
    private int startDay;
    private int startMonth;

    private int endDay;
    private int endMonth;

    private int length;

    private String name;

    private SeasonComponent() {
    }

    public SeasonComponent(int calendarStartDay, int calendarStartMonth, int calendarEndDay, int calendarEndMonth, int calendarLength, String seasonName) {
        startDay = calendarStartDay;
        startMonth = calendarStartMonth;

        endDay = calendarEndDay;
        endMonth = calendarEndMonth;

        length = calendarLength;

        name = seasonName;
    }

    public int getStartDay() {
        return startDay;
    }

   public int getStartMonth() {
        return startMonth;
    }

    public int getEndDay() {
        return endDay;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

}
