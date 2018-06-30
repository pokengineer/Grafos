package grafos;

import java.io.FileWriter;
import java.io.PrintWriter;

public abstract class Generadora {
	protected MatrizSimetrica mat;

	public Generadora(int n) {
		mat = new MatrizSimetrica(n);
	}

	public abstract void generar();

	public void imprimir() {
		int n;
		int ca = 0;
		double ad;
		int gmax = 0;
		int gmin;

		int cont;

		n = mat.getN();
		for (int i = 0; i < mat.getN(); i++) {
			for (int j = 0; j < mat.getN(); j++) {
				if (mat.get(i, j) == 1)
					ca++;
			}
		}
		ca /= 2;
		ad = ((double)ca / (double)mat.getT());
		gmin = n;
		for (int i = 0; i < mat.getN(); i++) {
			cont = 0;
			for (int j = 0; j < mat.getN(); j++) {
				if (mat.get(i, j) == 1)
					cont++;
			}
			if (cont > gmax) {
				gmax = cont;
			}

			if (cont < gmin) {
				gmin = cont;
			}

		}
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("grafo.in");
			pw = new PrintWriter(fichero);
			pw.println(n + " " + ca + " " + ad + " " + gmax + " " + gmin);

			for (int i = 0; i < mat.getN() - 1; i++) {
				for (int j = i + 1; j < mat.getN(); j++) {
					if (mat.get(i, j) == 1)
						pw.println(i + " " + j);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {

			if (null != fichero)
				fichero.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}
}
