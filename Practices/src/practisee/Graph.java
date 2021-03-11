package practisee;

public class Graph {
	int admatrix[][];
	public Graph(int nodes)
	{
		admatrix=new int[nodes][nodes];
	}
	public void addEdge(int r,int c)
	{
		admatrix[r][c]=1;
		admatrix[c][r]=1;
	}
	public void display()
	{
		for(int i=0;i<admatrix.length;i++)
		{
			for(int j=0;j<admatrix.length;j++)
				System.out.print(admatrix[i][j]+"    ");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Graph g=new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.display();
	}

}



