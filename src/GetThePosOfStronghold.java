
import fun.logger;

public class GetThePosOfStronghold {
    public static double version = 1.5;
    public static char BetaChar = 'x';
    public static final int Debug = fun.Debug.
/*Debug Type*/ NULL;

    public static void main(String[] args) {
        logger.message(logger.RUNNING_VERSION,version);

        if(BetaChar == 'x');
        else System.out.println(BetaChar);
        if(Debug == 0){
            fun.flow.user();
        }else{
            switch (Debug){
                case fun.Debug.NO_SCANNER:
                    fun.flow.Debug_no_Scanner();
                    break;
                default:
                    logger.error("An error happened, please check.");
            }
        }
    }
}

