
public class Main {

	public static void main(String[] args) {

		Complex a = new Complex(1, 2);
		Complex b = new Complex(3, 4);
		
		double i = 2;
		
		System.out.println(a + " + " + b + " = " + a.add(b));
		
		System.out.println(a + " - " + b + " = " + a.sub(b));
		
		System.out.println(a + " * " + b + " = " + a.mul(b));
		
		System.out.println(a + " / " + b + " = " + a.div(b) + "\n");
		
		
		System.out.println(a + " + " + i + " = " + a.add(i));
		
		System.out.println(a + " - " + i + " = " + a.sub(i));
		
		System.out.println(a + " * " + i + " = " + a.mul(i));
		
		System.out.println(a + " / " + i + " = " + a.div(i) + "\n");
		
		
		System.out.println(i + " + " + a + " = " + a.add(i));
		
		System.out.println(i + " - " + a + " = " + a.subOpposite(i));
		
		System.out.println(i + " * " + a + " = " + a.mul(i));
		
		System.out.println(i + " / " + a + " = " + a.divOpposite(i));
		
		

	}

}
