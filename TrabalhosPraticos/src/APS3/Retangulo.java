package APS3;

public class Retangulo {

	private float base;
	private float altura;
	private float perimetro;
	private float area;
		
	public Retangulo(float base, float altura) {
		this.altura = altura;
		this.base = base;
		calculoPerimetro();
		calculoArea();		
	}
	
	@Override
	public String toString() {
		return "Retangulo [base=" + this.base + ", altura=" + this.altura + ", perimetro=" + this.perimetro + ", area=" + this.area + "]";
	}

	public void calculoPerimetro() {
		this.perimetro = 2*this.base+2*this.altura;
	}
	public void calculoArea() {
		this.area = this.base*this.altura;
	}
	
}
