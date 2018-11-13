

public class GenericStackTest_Base {
	public static void main(String args[]) {
		GenericStack<String> stack1 = new GenericStack<>();
		
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		
		
		   while (!stack1.isEmpty()){
		        System.out.print(stack1.pop() + " ");  
		
		
	}
		   {
			   GenericStack stack2;
			   stack2 = new GenericStack<Avengers>();
			   stack2.push("Spiderman");
			   stack2.push("Dr.Strange");
		  
		   
		   for (int s = 0; s < stack2.getSize(); s++)
			   System.out.print(" ");
		   System.out.println();
		   
		   
	
		
		
		

		
	 
	    
     
	   while (!stack2.isEmpty()) {
		   System.out.print(stack2.pop() + " ");
		   
	   }
	    
	    }	    
	}
}
	

