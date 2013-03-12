package jKlout2.types;

public class ScoreDelta {
	
	public float getDayChange() {
		return dayChange;
	}
	public void setDayChange(float dayChange) {
		this.dayChange = dayChange;
	}
	public float getWeekChange() {
		return weekChange;
	}
	public void setWeekChange(float weekChange) {
		this.weekChange = weekChange;
	}
	public float getMonthChange() {
		return monthChange;
	}
	public void setMonthChange(float monthChange) {
		this.monthChange = monthChange;
	}
	private float dayChange;
	private float weekChange;
	private float monthChange;
}
