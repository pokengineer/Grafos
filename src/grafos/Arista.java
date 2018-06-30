package grafos;

public class Arista {
	private int no;
	private int nd;

	
	public Arista(int i, int j) {
		this.no = i;
		this.nd = j;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getNd() {
		return nd;
	}

	public void setNd(int nd) {
		this.nd = nd;
	}

}
