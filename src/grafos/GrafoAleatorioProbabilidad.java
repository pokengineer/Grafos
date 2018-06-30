package grafos;

public class GrafoAleatorioProbabilidad extends Generadora {
	private double proba;
	
	
	public GrafoAleatorioProbabilidad(int n, double p) {
		super(n);
		this.proba = p;
	}

	@Override
	public void generar() {
		
		for (int i = 0; i < mat.getN() - 1; i++) {
			for (int j = 1 + i; j < mat.getN(); j++) {
				if (Math.random() <= proba)
					mat.set(i, j, 1);
				else
					mat.set(i, j, 0);
			}
		}
	}
	

}
