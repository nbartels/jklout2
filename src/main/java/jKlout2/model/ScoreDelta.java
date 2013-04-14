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
     * @return
     */
    public double getDayChange() {
        return dayChange;
    }

    /**
     * get the week change of the users score
     *
     * @return
     */
    public double getWeekChange() {
        return weekChange;
    }

    /**
     * get the month change of the users score
     *
     * @return
     */
    public double getMonthChange() {
        return monthChange;
    }
}
