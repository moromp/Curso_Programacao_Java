package AreaCalculavel_Interface;

public class Quadrado implements AreaCalculavel {

	private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	public double getArea() {
		return lado * lado;
	}

}
