package fun;

import type.pos;

public class calc {
	public static double sind(double deg) {
		System.out.println("[INFO]>sind operation started");
		double r =
				Math.sin(deg / 180 * Math.PI);
		System.out.println("[INFO]>sind operation completed");
		return r;
	}

	public static double cosd(double deg) {
		System.out.println("[INFO]>cosd operation started");
		double r =
				Math.cos(deg / 180 * Math.PI);
		System.out.println("[INFO]>cosd operation completed");
		return r;
	}

	public static double getdis(pos aa, pos bb) {
		System.out.println("[INFO]>distance operation started");
		double r =
				rt(sq(aa.x-bb.x)+sq(aa.z-bb.z));
		System.out.println("[INFO]>distance operation completed");
		return r;
	}

	public static double sq(double a) {
		System.out.println("[INFO]>pow operation started");
		double r = Math.pow(a, 2);
		System.out.println("[INFO]>pow operation completed");
		return r;
	}

	public static double rt(double a) {
		System.out.println("[INFO]>rt operation started");
		double r = Math.sqrt(a);
		System.out.println("[INFO]>rt operation completed");
		return r;
	}
}
