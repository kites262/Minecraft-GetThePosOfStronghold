package fun;

public class logger {
	public static final int

//			NULL = 0,
			INFO = 1,
			WARN = 2,
			ERROR = 3,
			RED = 5;
	public static final int
			RUNNING_VERSION = 11,
			GITHUB_UPDATA = 12,
			ENTER_IN_NUMBER = 13,
			DATA_INPUT_ERROR = 14,
			DONE_MESSAGE = 15,
			ARROW_RIGHT = 16;

	public static void pl(int level, String in){
		if (level == INFO){
			info(in);
		}else if (level == WARN){
			warning(in);
		}else if (level == ERROR){
			error(in);
		}else if (level == RED) {
			System.err.println(in);
		}
	}
	public static void p(int level, String in){

	}
	public static void message(int type, double sign){
		if (type == RUNNING_VERSION){
			logger.pl(logger.RED, "You are running version " + sign);
		}else if (type == GITHUB_UPDATA){
			logger.pl(logger.INFO, "For latest version, https://github.com/kites262/Javasr/releases");
		}else if (type == ENTER_IN_NUMBER){
			logger.pl(logger.INFO, "Now enter two sets of data:");
		}else if (type == DATA_INPUT_ERROR){
			logger.pl(logger.ERROR, "Data error: Exist unsignificant figure(s)");
		}else if (type == DONE_MESSAGE){
			logger.pl(logger.INFO, "Done!(" + sign + "s)");
		}else if (type == ARROW_RIGHT){
			System.out.print("->");
		}
	}
	public static void newline(){
		System.out.println();
	}

	public static void info(String in){
		System.out.println("[INFO]>" + in);
	}
	public static void warning(String in){}
	public static void error(String in){
		System.err.println("[EROR]>" + in);
	}

}
