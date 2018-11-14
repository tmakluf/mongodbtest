package U3S1;


public class ControleNotas {

	private double N1;
	
	private double N2;

	private double N3;

	private double mediaFinal;

	public ControleNotas(double n1, double n2, double
			n3) {
		N1 = n1;
		N2 = n2;
		N3 = n3;
		mediaFinal = 0.0;
	}

	public double calculaNotaFinal()
	{
		mediaFinal = (N1*0.4)+ (N2*0.3) + (N3*0.3);
		return mediaFinal;
	}
}