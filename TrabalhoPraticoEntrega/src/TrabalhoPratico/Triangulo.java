package TrabalhoPratico;

public abstract class Triangulo implements FormasGeometricas{
	
	private float ladoA;
	private float ladoB;
	private float ladoC;
	private float perimetro;
	protected float area;

	
	public Triangulo(float ladoA, float ladoB, float ladoC) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	@Override
	public void calcularArea() {
		//Com essa fórmula é geral para qualquer triângulo
		float p = (this.ladoA+this.ladoB+this.ladoC)/2;
		this.area = (float) Math.sqrt(p*(p-this.ladoA)*(p-this.ladoB)*(p-this.ladoC));
	}

	@Override
	public void calcularPerimetro() {
		
		this.perimetro = this.ladoA+this.ladoB+this.ladoC;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public float getArea() {
		return area;
	}
	

}
