import java.util.Arrays;

public class Player {
	
	private int size;
	private double battingaverage;
	private double sluggingPercent;
	private int[] atBats;
	private int[] results;

	public Player() {

		double battingaverage = 0.0;
		double sluggingPercent = 0.0;
		int[] atBats = new int[size];
		int[] results = new int[size];

	}

	public double getBattingavg() {
		return battingaverage;
	}

	public void setBattingavg(double battingavg) {
		this.battingaverage = battingavg;
	}

	public double getSluggingPercent() {
		return sluggingPercent;
	}

	public void setSluggingPercent(double sluggingPercent) {
		this.sluggingPercent = sluggingPercent;
	}

	public int[] getAtBats() {
		return atBats;
	}

	public void setAtBats(int[] atBats) {
		this.atBats = atBats;
	}

	public int[] getResults() {
		return results;
	}

	public void setResults(int[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Player [battingavg=" + battingaverage + ", sluggingPercent=" + sluggingPercent + ", atBats="
				+ Arrays.toString(atBats) + ", results=" + Arrays.toString(results) + ", getBattingavg()="
				+ getBattingavg() + ", getSluggingPercent()=" + getSluggingPercent() + ", getAtBats()="
				+ Arrays.toString(getAtBats()) + ", getResults()=" + Arrays.toString(getResults()) + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public double getBattingaverage() {
		return battingaverage;
	}

	public void setBattingaverage(double battingaverage) {
		this.battingaverage = battingaverage;
	}

}
