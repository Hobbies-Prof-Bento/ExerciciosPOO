package TrabalhoPratico;

public class TrianguloIsosceles extends Triangulo{
	
	private float ladoIsus;
	private float ladoCos;

	public TrianguloIsosceles(float ladoIsus, float ladoCos) {
		super(ladoIsus, ladoIsus, ladoCos);
		this.ladoIsus = ladoIsus;
		this.ladoCos = ladoCos;
	}
	
	@Override
	public void calcularArea() {
		
		float altura = (float) Math.sqrt(Math.pow(this.ladoIsus, 2)-Math.pow((this.ladoCos/2), 2));
		this.area = (this.ladoCos*altura)/2;
	}

	@Override
	public String toString() {
		return "\nTriângulo Isósceles \nPerímetro=" + getPerimetro() + "\nÁrea=" + getArea();
	}

}
