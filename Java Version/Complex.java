
public class Complex {

	public Complex(double r, double i) {
		
		real = r;
		
		imaginary = i;
		
	}
	
	public Complex add(Complex num) {
		
		double realPart = real + num.real;
		
		double imaginaryPart = imaginary + num.imaginary;
		
		return new Complex(realPart, imaginaryPart);
		
	}
	
	public Complex sub(Complex num) {
		
		double realPart = real  - num.real;
		
		double imaginaryPart = imaginary - num.imaginary;
		
		return new Complex(realPart, imaginaryPart);
		
	}
	
	public Complex mul(Complex num) {
		
		double realPart = real * num.real + (-1) * (num.imaginary * imaginary);
		
		double imaginaryPart = num.real * imaginary + real * num.imaginary;
		
		return new Complex(realPart, imaginaryPart);
		
	}
	
	public Complex div(Complex num) {
		
		double conjugateReal = num.real;

		double conjugateImaginary = (-1) * num.imaginary;

		double realNumerator = real * conjugateReal + (-1) * imaginary * conjugateImaginary;

		double imaginaryNumerator = real * conjugateImaginary + imaginary * conjugateReal;

		double denominator = (num.real * conjugateReal) + num.real * conjugateImaginary + num.imaginary * conjugateReal + (-1) * num.imaginary * conjugateImaginary;

		return new Complex(realNumerator / denominator, imaginaryNumerator / denominator);
		
	}
	
	public Complex add(double dbl) {
		
		return new Complex(dbl + real, imaginary);
		
	}
	
	public Complex sub(double dbl) {
		
		return new Complex(real - dbl, imaginary);
		
	}
	
	public Complex mul(double dbl) {
		
		return new Complex(real * dbl, imaginary * dbl);
		
	}
	
	public Complex div(double dbl) {
		
		return new Complex(real / dbl, imaginary / dbl);
		
	}
	
	public Complex subOpposite(double dbl) {
		
		Complex b = new Complex(real, imaginary);
		
		Complex c = new Complex(dbl, 0);
		
		return c.sub(b);
		
	}
	
	public Complex divOpposite(double dbl) {
		
		Complex c = new Complex(dbl, 0);
		
		Complex d = new Complex(real, imaginary);
		
		return c.div(d);
		
	}
	
	public String toString() {
		
		return "(" + real + " + " + imaginary + "i)";
		
	}
	
	private double real;
	
	private double imaginary;
	
}
