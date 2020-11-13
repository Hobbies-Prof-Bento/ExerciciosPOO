package TrabalhoPratico;

public class Circulo implements FormasGeometricas{

	private float raio;
	private float perimetro;
	private float area;
	
	public Circulo(float raio) {
		super();
		this.raio = raio;
	}

	@Override
	public void calcularArea() {
		
		this.area = (float) (Math.PI*Math.pow(raio, 2));
	}

	@Override
	public void calcularPerimetro() {

		this.perimetro = (float) (2*Math.PI*this.raio);
	}
	public float getPerimetro() {
		return perimetro;
	}
	public float getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "\nCírculo \nPerímetro=" + perimetro + "\nÁrea=" + area;
	}	
	

}
