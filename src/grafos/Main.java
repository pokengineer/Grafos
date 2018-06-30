package grafos;

public class Main {

	public static void main(String[] args) {
		//Generadora g=new GrafoRegularGrado(500, 101);
		//Generadora g=new GrafoRegularPorcentaje(6, 60);
		//Generadora g=new GrafoAleatorioProbabilidad(500, 0.8);
		//Generadora g=new GrafoAleatorioPorcentaje(6, 50);
		//g.generar();
		//g.imprimir();
		//System.out.println("listo");
		Procesadora p = new Procesadora(50);
		p.mostrarNodos();
		int[] caca = p.dijkstra(1);
	
		for(int i=0; i< caca.length ; i++)
			System.out.println(caca[i]);
	}
	

}
