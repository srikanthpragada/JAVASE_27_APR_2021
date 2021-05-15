package oop;

import java.util.Arrays;

class Time implements Comparable<Time> {
	private int h, m, s;

	public Time(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", this.h, this.m, this.s);
	}

	public int totalSeconds() {
		return this.h * 3600 + this.m * 60 + this.s;
	}

	@Override
	public int compareTo(Time other) {
       return this.totalSeconds() - other.totalSeconds();
	}
}

public class SortTimes {
	public static void main(String[] args) {
		var times = new Time[] { new Time(10, 20, 30), new Time(20, 10, 15), new Time(5, 5, 5) };

		Arrays.sort(times);

		for (var t : times)
			System.out.println(t);
	}
}
