package TrabalhoPratico;

public class TrianguloEquilatero extends Triangulo{

	private float lado;
	
	public TrianguloEquilatero(float lado) {
		super(lado, lado, lado);
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		
		
		this.area = (float) ((Math.pow(this.lado, 2)*Math.sqrt(3))/4);
	}

	@Override
	public String toString() {
		return "\nTriângulo Equilátero \nPerímetro=" + getPerimetro() + ", \nÁrea=" + getArea();
	}
	

}
