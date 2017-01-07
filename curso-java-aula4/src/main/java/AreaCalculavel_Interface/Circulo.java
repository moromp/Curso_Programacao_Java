package AreaCalculavel_Interface;

public class Circulo implements AreaCalculavel{

	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	public double getArea() {
		return raio * raio * Math.PI;
	}

}
