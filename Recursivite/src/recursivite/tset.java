package recursivite;

	
public class tset {
	static int facto(int nombre) {
		if (nombre == 0) {
			return 1;
		} else {
			return (nombre * facto(nombre-1));
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(facto(50));
	}
}
