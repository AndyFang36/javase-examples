package others;

import java.io.*;

public class Print {
	// print with a new line
	public static void print(Object obj){
		System.out.println(obj);
	}
	//print a new line by itself
	public static void print(){
		System.out.println();
	}
	//print with no line break
	public static void printNb(Object obj){
		System.out.println(obj);
	}
	//printf() (from C)
	public static PrintStream printf(String format, Object... args){
		return System.out.printf(format, args);
	}
}
