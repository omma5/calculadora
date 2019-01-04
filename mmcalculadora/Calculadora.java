package mmcalculadora;

public class Calculadora {
	//atributos
	private double num1;
	private double num2;
	//constructor con par�metros
	public Calculadora(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	//consultores
	public double getNum1() {
		return num1;
	}
	public double getNum2() {
		return num2;
	}
	//modificadores
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	//toString
	@Override
	public String toString() {
		return "Calculadora [num1=" + num1 + ", num2=" + num2 + "]";
	}
	public double suma() {
		return this.num1+this.num2;
	}
	public double multiplicacion() {
		return this.num1*this.num2;
	}
	public double resta() {
		return this.num1-this.num2;
	}
}
