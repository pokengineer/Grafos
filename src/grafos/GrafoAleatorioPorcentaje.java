package grafos;

import java.util.*;

public class GrafoAleatorioPorcentaje extends Generadora {
	private double p;
	
	
	public GrafoAleatorioPorcentaje(int n, double p) {
		super(n);
		this.p = p;
	}

	@Override
	public void generar() {
		
		ArrayList<Arista> lista = new ArrayList<Arista>();
		for (int i = 0; (i < mat.getN() - 1); i++) {
			for (int j = 1 + i; (j < mat.getN()); j++) {
				lista.add(new Arista(i, j)); // cargo lista
			}
		}

		Collections.shuffle(lista);
		int numero = (int)(this.p * lista.size());
		for (int i = 0; i < numero; i++) {
			mat.set( lista.get(i).getNo() , lista.get(i).getNd(), 1 ); //paso lo de la lista al vector
		}
		
	}
	
	

}
