import java.util.*;
public class Output2 {
	//				Question 2
//	public int i = 5;
//	static int k = 2;
//	public static void main(String[][] args) {
//		int j = i;
//		m1();
//	}
//	public void m1() {
//		i = i + k + m2(i,k);
//	}
//	public static int m2(int i, int j) {
//		return(int)(Math.pow(i, j));
//	}
	
	//				Question 3
//	private static int i = 0;
//	private static int j = 0;
//	public static void main(String[] args) {
//		int i=2;
//		int k =3;
//		{
//			int j = 3;
//			System.out.println("i+j is " + i + j);
//		}
//		k= i + j;
//		System.out.println("k is " + k);
//		System.out.println("j is " + j);
//	}
	
//					Question 4
//	public static void main(String[] args) {
//		int[] a = {1,2};
//		for(int e:swap(a)) {
//			System.out.println(e);
//		}
//	}
//	public static int[] swap(int[]x) {
//		int [] temp = new int[2];
//		temp[0] = x[1];
//		temp[1] = x[0];
//		return temp;
//	}
	
//				Question 5
//	public static void main(String[] args) {
//		int[] a = {1,2};
//		swap(a);
//		System.out.println(a[0] + " , " + a[1]);
//	}
//	public static void swap(int[]x) {
//		int temp;
//		temp = x[0];
//		x[0] = x[1];
//		x[1] = temp;
//	}
//	
	
//				Question 6
//	private int p;
//	public Output2() {
//		System.out.println("C's no arg constructor invoked");
//		this(0);
//	}
//	public Output2(int p) {
//		p = p;
//	}
//	public void setP(int p) {
//		p=p;
//	}
//	public static void main(String[] args) {
//		Problem p = new Problem();
//	}
	
//				Question 7
//	private  int id;
//	public int m1() {
//		this.id = 45;
//		return this.id;
//	}
//	public void m2() {
//		Output2.id = m1()+5;
//		System.out.println("id is " + id);
//	}
//	public static void main(String[] args) {
//		Output2 md = new Output2();
//		md.m2();
//	}

//				Question 8	
//	public static void main(String[] args) {
//	ArrayList<Double> list = new ArrayList<>();
//	list.add(1.0);
//	}
	
	//			Question 9
//	private int x;
//	public Output2(int x) {
//		this.x = x;
//	}
//	public static void main(String[] args) {
//		ClassB b = new ClassB();
//	}
//	public ClassB extends Output2{
//		public ClassB() {
//			
//		}
//	}
	
	//			Question 10
//	public static void main(String[] args) {
//		new AA();
//		new BB();
//	}
//}
//class AA{
//	int i = 7;
//	public AA() {
//		setI(20);
//		System.out.println("i from AA is " + i);
//	}
//	public void setI(int i) {
//		System.out.println("set i of AA");
//		this.i = 2*i;
//	}
//}
//class BB extends AA{
//	public BB() {
//		System.out.println("i from BB is " + i);
//	}
//	public void setI(int i) {
//		System.out.println("set i of BB");
//		this.i = 3*i;
//	}
	
	//				Question 12
	public static Integer max(ArrayList<Integer> list){
		if(list.size()==0) return  null;
		   Collections.sort(list); // Sort the arraylist
		   return (list.get(list.size() - 1)); //gets the last item, largest for an ascending sort
		  
		}
		  

		   public static void main(String[] args) {
		       int n=1;
		       ArrayList<Integer> list =new ArrayList<Integer>();
		       Scanner s=new Scanner(System.in);
		       System.out.println("Start entering the values to stop enter 0");
		       while(n!=0){
		           n=s.nextInt();
		           list.add(n);
		       }
		       System.out.println(max(list));
		   }


}

