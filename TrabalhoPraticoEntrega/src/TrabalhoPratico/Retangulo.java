package TrabalhoPratico;

public class Retangulo implements FormasGeometricas{

	private float base;
	private float altura;
	private float perimetro;
	private float area;	
	
	public Retangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
		
	}
	@Override
	public void calcularArea() {
		
		this.area = this.base*this.altura;
	}
	@Override
	public void calcularPerimetro() {
		
		this.perimetro = 2*(this.altura+this.base);		
	}
	public float getPerimetro() {
		return perimetro;
	}
	public float getArea() {
		return area;
	}
	@Override
	public String toString() {
		return "\nRet�gulo \nPer�metro=" + perimetro + "\n�rea=" + area;
	}	
	
}
