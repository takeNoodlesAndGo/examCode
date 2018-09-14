package vivo;

import java.net.StandardSocketOptions;

class SuperClass {
	static {
		System.out.println("super static block");
	}
	public SuperClass() {
		System.out.println("super  c");
	}
}
public class Main extends SuperClass {
	static {
		System.out.println("subclass of static block");
	}
	public Main() {
		System.out.println("subclass c");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main t= new Main();
	}

}
