
public class Triangulo {

	double a1;
	double a2;
	double a3;
	
	public double calculoP()
	{
		double p = (this.a1 + this.a2 + this.a3) / 2;
		
		return p;
	}
	
	public double calculoArea()
	{
		double p1 = calculoP();
		double areaX = Math.sqrt(p1 * (p1 - this.a1) * (p1 - this.a2) * (p1 - this.a3));
		
		return areaX;
	}
}
