package grafos;

public class GrafoRegularGrado extends Generadora {
	private int grado;

	public GrafoRegularGrado(int n, int g) {
		super(n);
		this.grado = g;
	}

	@Override
	public void generar() {

		if (this.grado < this.mat.getN()) {

			if (this.grado % 2 == 0) {
				// pares
				for (int i = 0; i < this.mat.getN(); i++) {
					for (int j = i + 1; j < i + (this.grado / 2); j++) {
						this.mat.set(i, j % this.mat.getN(), 1);
					}
				}
			} else {
				// impares
				if (this.mat.getN() % 2 == 0) {
					// chequeo que N sea par (porque sino no se puede)
					int x = ((this.mat.getN() - 1) - this.grado) / 2;
					for (int i = 0; i < this.mat.getN(); i++) {
						for (int j = 1 + i + x; j < (i + x + this.grado + 1); j++) {
							this.mat.set(i, j % this.mat.getN(), 1);
						}
					}
				}
			}
			
			
		}
	}

}
