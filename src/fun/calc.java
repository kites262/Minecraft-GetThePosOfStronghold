package fun;

import type.pos;

public class calc {
	public static double sind(double deg) {
		logger.pl(logger.INFO,"sind operation started");
		double r =
				Math.sin(deg / 180 * Math.PI);
		logger.pl(logger.INFO,"sind operation completed");
		return r;
	}

	public static double cosd(double deg) {
		logger.pl(logger.INFO,"cosd operation started");
		double r =
				Math.cos(deg / 180 * Math.PI);
		logger.pl(logger.INFO,"cosd operation completed");
		return r;
	}

	public static double getdis(pos aa, pos bb) {
		logger.pl(logger.INFO,"distance operation started");
		double r =
				rt(sq(aa.x-bb.x)+sq(aa.z-bb.z));
		logger.pl(logger.INFO,"distance operation completed");
		return r;
	}

	public static double sq(double a) {
		logger.pl(logger.INFO,"pow operation started");
		double r = Math.pow(a, 2);
		logger.pl(logger.INFO,"pow operation completed");
		return r;
	}

	public static double rt(double a) {
		logger.pl(logger.INFO,"rt operation started");
		double r = Math.sqrt(a);
		logger.pl(logger.INFO,"rt operation completed");
		return r;
	}

	public static double three_number_behind(double r){
		return ((int)(r*1000.0))/1000.0;
	}
}
