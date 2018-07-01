package grafos;

public class GrafoNPartito extends Generadora {
	int grupos;
	
	public GrafoNPartito(int n, int g) {
		super(n);
		this.grupos = g;
	}

	public void generar() {
		if( this.grupos > this.mat.getN() )
			return;
		
		//a implementar
	}
	
}