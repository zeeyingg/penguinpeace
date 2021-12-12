public class Passer {

	public static void main(String[] args){
		int b = 0;
		System.out.println("Original value of a: " + b);
		change(b);
		System.out.println("New value of a: " + b);
		System.out.println("If the value is the orignal value, then Java is pass-by-value");
		System.out.println("If the value has changed, then java is pass-by-reference");
	}


	public static void change(int m){
		m = 1;
	}
}
