package fun;

public class logger {
	public static final int

//			NULL = 0,
			INFO = 1,
			WARN = 2,
			EROR = 3,
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
		}else if (level == EROR){
			error(in);
		}else if (level == RED){
			System.err.println(in);
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
