package condition;


public class Condition {
	enum Color {
		blue, green, red, yellow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color selectedColor = Color.green;
		
		switch (selectedColor) {
		case blue:
	            System.out.println("The color is blue");
	            break;
		case green:
	            System.out.println("The color is green");
	            break;
		case red:
	            System.out.println("The color is red");
	            break;
		case yellow:
	            System.out.println("The color is yellow");
	            break;
	    default:
	            System.out.println("We do not know the color!");
	        
		}
	}

}
