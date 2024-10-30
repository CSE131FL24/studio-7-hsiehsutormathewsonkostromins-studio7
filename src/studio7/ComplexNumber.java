package studio7;

public class ComplexNumber {
	
	private int real;
	private int imaginary;
	
	public ComplexNumber(int initReal, int initImaginary) {
		real = initReal;
		imaginary = initImaginary;
	}
	
	public String add(ComplexNumber one, ComplexNumber two) {
		return (one.getReal() + two.getReal()) + " + " + (one.getImaginary() + two.getImaginary()) + "i";
	}
	
	public String multi(ComplexNumber one, ComplexNumber two) {
		return ((one.getReal() * two.getReal()) - (two.getImaginary() * one.getImaginary())) + " + " + ((one.getReal() * two.getImaginary()) + (one.getImaginary() * two.getReal()) + "i");
	}

	public double getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber one = new ComplexNumber(1, 2);
		ComplexNumber two = new ComplexNumber(2, 3);
		System.out.println(one.add(one, two));
		System.out.println(one.multi(one, two));
	}

}
