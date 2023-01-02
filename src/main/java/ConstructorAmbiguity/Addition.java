package ConstructorAmbiguity;

public class Addition {

	private int num1;
	private int num2;
	
	
	public Addition(int num1, int num2) {
		System.out.println("int int constructor");
		this.num1 = num1;
		this.num2 = num2;
	}
	public Addition(double num1, double num2) {
		System.out.println("double double constructor");
		this.num1 = (int) num1;
		this.num2 = (int) num2;
	}
	public Addition(String num1, String num2) {
		System.out.println("String String constructor");
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
	}

	public Addition() {
	}

	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void sum() {
		System.out.println("Sum: "+(num1+num2));
	}
}
