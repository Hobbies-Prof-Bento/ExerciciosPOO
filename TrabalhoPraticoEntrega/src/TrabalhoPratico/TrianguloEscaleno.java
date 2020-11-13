package TrabalhoPratico;

public class TrianguloEscaleno extends Triangulo{
	
	public TrianguloEscaleno(float ladoA, float ladoB, float ladoC) {
		super(ladoA, ladoB, ladoC);
				
	}

	@Override
	public String toString() {
		return "\nTri�ngulo Escaleno \nPer�metro=" + getPerimetro() + "\n�rea=" + getArea();
	}

}
