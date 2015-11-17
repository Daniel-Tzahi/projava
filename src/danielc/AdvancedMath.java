package danielc;

public class AdvancedMath {
	
	int radius = 50;
	double num = Math.PI;
	int degree = 30;
	double hypotenuse =50;
	double sin = Math.sin(degree);
	double opposite;
	int base = 20;
	int exp = 13;
	int power =  (int) Math.pow(base, exp);
	
	String line1= new String ("Area of circle with radius: " + (radius) + " is: " + (int)((radius * radius)*num) + " squarecm.");
	String line2= new String ("Length of opposite where angle B is 30 degrees and Hypotenuse length is 50 cm is: "  + (sin*hypotenuse) +" cm");
	String line3= new String ("Power of 20 with exp of 13 is: " + power);
	
	
	

	public String getResults() {
		String result= new String (line1 +"<br>" + line2 +"<br>" + line3 + "<br>");
		return result;
	}

	
}
