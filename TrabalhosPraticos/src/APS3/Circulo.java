package APS3;

public class Circulo {
	private double raio;
	private double perimetro;
	private double area;
	
	public Circulo(double raio) {
		this.raio = raio;
		calculoPerimetro();
		calculoArea();
	}	
	@Override
	public String toString() {
		return "Circulo [raio=" + this.raio + ", perimetro=" + this.perimetro + ", area=" + this.area + "]";
	}

	public void calculoPerimetro() {
		this.perimetro = 2*Math.PI*this.raio;
	}
	public void calculoArea() {
		this.area = Math.PI*Math.pow(this.raio, 2);
	}
}
