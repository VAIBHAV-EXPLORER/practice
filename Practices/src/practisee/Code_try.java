package practisee;

public class Code_try {
	int a;

	public static void main(String[] args) {
		
		float k=12.235f;
		int t=(int) k;
		System.out.println("t");
		// TODO Auto-generated method stub
		String st="123.23";
		String ar[]=st.split("(?<=\\.\\d{0})");
		System.out.println(ar[0]);
		int p=Integer.valueOf(st);
		
		
		
	}
	public void temp(int a)
	{
		this.a=a;
	}

}
