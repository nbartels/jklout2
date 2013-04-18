/*
 * Copyright 2013 Norbert Bartels
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jKlout2.model;

/**
 * ScoreDelta is a object that aggregates the day, week and month change of the
 * users score.
 */
public class ScoreDelta {

    private double dayChange;
    private double weekChange;
    private double monthChange;

    /**
     * get the day change of the users score
     *
     * @return day change
     */
    public double getDayChange() {
        return dayChange;
    }

    /**
     * get the week change of the users score
     *
     * @return week change
     */
    public double getWeekChange() {
        return weekChange;
    }

    /**
     * get the month change of the users score
     *
     * @return month change
     */
    public double getMonthChange() {
        return monthChange;
    }
}
