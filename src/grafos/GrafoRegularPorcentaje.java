package grafos;

public class GrafoRegularPorcentaje extends Generadora {
	private int p;

	public GrafoRegularPorcentaje(int n, int g) {
		super(n);
		this.p = g;
	}

	@Override
	public void generar() {
		int aristas = ((this.p * mat.getT()) / 100); // Aristas de acuerdo al porcentaje
		float grado = (2 * aristas) / mat.getN();
 		while (grado - (int)grado  != 0) {
			aristas--;
			grado = (2 * aristas) / mat.getN();
		}
		// GrafoRegularGrado aux=new GrafoRegularGrado(mat.getN(),grado);
		if (grado < this.mat.getN()) {

			if (grado % 2 == 0) {
				// pares
				for (int i = 0; i < this.mat.getN(); i++) {
					for (int j = i + 1; j < i + (grado / 2); j++) {
						this.mat.set(i, j % this.mat.getN(), 1);
					}
				}
			} else {
				// impares
				if (this.mat.getN() % 2 == 0) {
					// chequeo que N sea par (porque sino no se puede)
					int x = ((this.mat.getN() - 1) - (int)grado) / 2;
					for (int i = 0; i < this.mat.getN(); i++) {
						for (int j = 1 + i + x; j < (i + x + grado + 1); j++) {
							this.mat.set(i, j % this.mat.getN(), 1);
						}
					}
				}
			}

		}

	}

}
