package com.assistedproject;

public class MethodTypes {

	public void hello()
	{
		System.out.println("Inside hello method. No return type");
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public double mul(double a, double b)
	{
		return a*b;
	}
	
	public float div(float a, float b)
	{
		return a/b;
	}
	
	public String ending()
	{
		return "end programme";
	}

	public static void main(String[] args) {
		MethodTypes m = new MethodTypes();
		m.hello();
		System.out.println(m.add(20, 30));
		System.out.println(m.mul(50, 80));
		System.out.println(m.div(200, 10));
		System.out.println(m.ending());

	}


}
