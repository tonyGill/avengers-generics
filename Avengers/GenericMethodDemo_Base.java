
public class GenericMethodDemo_Base {
	  public static void main(String[] args ) {
		  //Integer is more versatile than int //
	    Integer[] integers = {1, 2, 3, 4, 5};
	    String[] strings = {"Vancouver", "Paris", "New York", "Austin"};
	    Avengers[] name = {new Avengers ("Spiderman"), new Avengers ("Hulk")};
	    GenericMethodDemo_Base.<Integer>print(integers);
	    GenericMethodDemo_Base.<String>print(strings);
	    GenericMethodDemo_Base.<Avengers>print(name); // quiz question 
	  }

	  public static <E> void print(E[] list) {
	    for (int i = 0; i < list.length; i++) // Integer type for loops and increments 
	      System.out.print(list[i] + " "); 
	    System.out.println(); 
	  }
	    
	}
	    
	

