package grafos;

import java.util.*;

import javax.swing.SingleSelectionModel;

public class Procesadora {
	private static int INFINITO = 99999;
	private int[][] mat;

	public Procesadora(int n) {
		this.mat = new int[n-1][n-1];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (Math.random() < 0.6) {
					mat[i][j] = (int) (Math.random() * 10)+1;
				} else
					mat[i][j] = INFINITO;
			}
		}
	}
	
	public Procesadora() {
		this.mat = new int[][] {{0,5,INFINITO,INFINITO,2},{INFINITO,0,7,9,INFINITO},{4,INFINITO,0,INFINITO,INFINITO},{INFINITO,INFINITO,INFINITO,0,5},{2,INFINITO,INFINITO,INFINITO,0}};
	}

	public void mostrarNodos() {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] != 0) {
					System.out.println(i + " " + j);
				}
			}
		}
		System.out.println('\n');
	}

	public static void main(String[] args) {
		Procesadora p = new Procesadora();
		p.mostrarNodos();
		int[] caca = p.dijkstra(1);
	
		for(int i=0; i< caca.length ; i++)
			System.out.println(caca[i]);
	}

	/**
	 * Consigue la distancia entre un nodo y todos los otros nodos (usando una
	 * Lista).
	 * 
	 * @param nodoOrigen
	 */
	public int[] dijkstra(int nodoOrigen) {
		int[] dist = new int[mat.length];
		int[] camino = new int[mat.length];
		int nodo = nodoOrigen;
		Set<Integer> nodosRestantes = new HashSet<Integer>(mat.length);

		// pongo en dist las distancias que ya tengo y pongo en infinito lo que me falta
		for (int i = 0; i < dist.length; i++) {
			if ( (mat[nodo][i] != 0) &&  (nodo != i) ) {
				dist[i] = mat[nodo][i];
			} else {
				dist[i] = INFINITO;
			}
			nodosRestantes.add(i); // lleno la lista de nodos restantes
		}

		nodosRestantes.remove(nodo); // saco el primero

		// proceso hasta que no queden nodos por procesar
		while (!nodosRestantes.isEmpty()) {

			// busco el mas chico
			int minNodo = nodo, minValor = INFINITO;
			for (Integer indice : nodosRestantes) {
				if (dist[indice] < minValor) {
					minNodo = indice;
					minValor = dist[indice];
				}
			}

			// lo saco de la lista porque lo voy a procesar
			nodosRestantes.remove(minNodo);

			// dijkstra
			for (Integer indice : nodosRestantes) {
				if (dist[minNodo] + mat[minNodo][indice] < dist[indice]) {
					dist[indice] = dist[minNodo] + mat[minNodo][indice];
					camino[indice] = minNodo;
				}
			}

		}

		return dist;
	}

}
