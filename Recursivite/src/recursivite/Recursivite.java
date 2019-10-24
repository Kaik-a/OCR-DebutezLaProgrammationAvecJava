package recursivite;

public class Recursivite {
	
	public static int factoriel(long a) {
		if (a == 0) return 1; 
		else return a * factoriel(a-1);
		
	}
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factoriel(50));
	}

}
