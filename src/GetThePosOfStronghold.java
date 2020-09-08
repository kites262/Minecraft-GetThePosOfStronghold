//
import java.util.Scanner;

public class GetThePosOfStronghold {
    static final double v = 1.5;
    static final boolean GUIDebug =
            false
            ;

    static Scanner scan = new Scanner(System.in);
    static pos a = new pos();
    static pos b = new pos();
    static pos s = new pos();
    static double m = 0;
    static double n = 0;
    static double deg1 = 0;
    static double deg2 = 0;
    static String value = "NULL";
    static long stime = -1;
    static double lastime = -1;
//    static boolean isFinished = false;
    public static void main(String[] args) {
        logger.pl(logger.RED, "You are running version " + v);
        if(!GUIDebug) {
            logger.pl(logger.INFO, "For latest version, https://github.com/kites262/Javasr/releases");
            logger.newline();
            logger.pl(logger.INFO, "Now enter two sets of data:");
            try {
                System.out.print("->");
                {
                    a.x = scan.nextDouble();
                    a.z = scan.nextDouble();
                    deg1 = scan.nextDouble();
                }
                System.out.print("->");
                {
                    b.x = scan.nextDouble();
                    b.z = scan.nextDouble();
                    deg2 = scan.nextDouble();
                }
                stime = System.currentTimeMillis();
                m = getdis(a, s);
                n = getdis(b, s);
            } catch (Exception error) {
                logger.pl(logger.EROR, "Data error: Exist unsignificant figure(s)");
                error.printStackTrace();
                System.exit(1);
            } finally {
                s.x =
                        a.x * sind(deg2) * cosd(deg1) - b.x * sind(deg1) * cosd(deg2) + (a.z - b.z) * sind(deg1) * sind(deg2);
                s.x =
                        s.x / sind(deg2 - deg1);
                s.z =
                        b.z * sind(deg2) * cosd(deg1) - a.z * sind(deg1) * cosd(deg2) - (a.x - b.x) * cosd(deg1) * cosd(deg2);
                s.z =
                        s.z / sind(deg2 - deg1);
            }
            value = s.x + ", " + s.z;
            logger.pl(logger.RED, s.x + ", " + s.z);
            lastime = ((System.currentTimeMillis() - stime) / 1000.0);
            new ShowResult().ResultGUI("Done in " + lastime + "s", s, a, b, deg1, deg2);
            logger.pl(logger.INFO, "Done!(" + lastime + "s)");
        }else {
            lastime = 1.111;
            s.x = 3.333;
            s.z = 3.333;
            a.x = 1.111;
            a.z = 1.111;
            b.x = 2.222;
            b.z = 2.222;
            new ShowResult().ResultGUI("Done in " + lastime + "s", s, a, b, deg1, deg2);
        }
 }

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

    private static double getdis(pos aa,pos bb) {
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


/*
 *
 * Find StrongHold Calculate:
 * a.x sin thetaO cos thetaP - b.x sin thetaP cos thetaO +( a.z- b.z )sin thetaP sin thetaO
 * b.z sin thetaO cos thetaP - a.z sin thetaP cos thetaO -( a.x - b.x )cos thetaP cos thetaO
 *
 */