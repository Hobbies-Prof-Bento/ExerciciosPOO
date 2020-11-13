package TrabalhoPratico;

public class Quadrado extends Retangulo{

	public Quadrado(float lado) {
		super(lado, lado);	}

	@Override
	public String toString() {
		return "\nQuadrado \nPerímetro=" + getPerimetro() + "\nÁrea=" + getArea();
	}
	

}
