package grafos;

public class MatrizSimetrica {
	private int[] vector;
	private int n;
	private int t;

	public MatrizSimetrica(int n) {
		this.n = n;
		this.t = ((n * n) - n) / 2;
		this.vector = new int[this.t];

		for (int i = 0; i < this.t; i++) {
			vector[i] = 0;
		}

	}

	public int get(int f, int c) {
		if(f<c) 
			return vector[f * this.n + c - (f * f + 3 * f + 2) / 2];
		if(f>c) 
			return vector[c * this.n + f - (c * c + 3 * c + 2) / 2];
		return 0;
	}

	public void set(int f, int c, int num) {
		if(f<c) 
			vector[f * this.n + c - (f * f + 3 * f + 2) / 2] = num;
		if(f>c) 
			vector[c * this.n + f - (c * c + 3 * c + 2) / 2] = num;
	}

	public int getN() {
		return this.n;
	}

	public int getT() {
		return t;
	}

}
