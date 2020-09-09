package type;

import fun.calc;

public class pos {
    public double
            x = 0,
            z = 0;
    public static String toString(pos p){
        return ""
                +p.x
                +", "
                +p.z;
    }

    public static String toString__three_number_behind(pos p){
        return ""
                + calc.three_number_behind(p.x)
                +", "
                + calc.three_number_behind(p.z);
    }
}