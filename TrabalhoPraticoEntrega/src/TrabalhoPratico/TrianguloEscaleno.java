package TrabalhoPratico;

public class TrianguloEscaleno extends Triangulo{
	
	public TrianguloEscaleno(float ladoA, float ladoB, float ladoC) {
		super(ladoA, ladoB, ladoC);
				
	}

	@Override
	public String toString() {
		return "\nTriângulo Escaleno \nPerímetro=" + getPerimetro() + "\nÁrea=" + getArea();
	}

}
