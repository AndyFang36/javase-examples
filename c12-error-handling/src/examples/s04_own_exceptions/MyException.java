package examples.s04_own_exceptions;

class MyException extends Exception{
	public MyException(){
	}
	public MyException(String msg){
		super(msg);
	}
}
