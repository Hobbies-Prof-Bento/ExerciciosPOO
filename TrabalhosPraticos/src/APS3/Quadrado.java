package APS3;

public class Quadrado {
	
	private double lado;
	private double perimetro;
	private double area;
	
	public Quadrado(double lado) {		
		this.lado = lado;
		calculoPerimetro();
		calculoArea();
	}	
	@Override
	public String toString() {
		return "Quadrado [lado=" + this.lado + ", perimetro=" + this.perimetro + ", area=" + this.area + "]";
	}

	public void calculoPerimetro() {
		this.perimetro = 4*this.lado;
	}
	public void calculoArea() {
		this.area = Math.pow(this.lado, 2);
	}
	

}
