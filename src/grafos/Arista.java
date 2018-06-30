package grafos;

public class Arista implements Comparable<Arista> {
	private int no;
	private int nd;
	private int value;

	public Arista(int no, int nd, int value) {
		this.no = no;
		this.nd = nd;
		this.value = value;
	}

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

	public int getValue() {
		return this.value;
	}

	@Override
	public int compareTo(Arista o) {
		return this.value - o.value;
	}

}
