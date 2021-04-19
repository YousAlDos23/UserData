
public class Abdullah extends Student {
	
	
	//Example 1
	// overriding method
	  @Override
	  public void Message(){
	    System.out.println("I am Abdullah");
	  }
	    
	    public void printMessage(){

	        // this calls overriding method
	    	Message();

	        // this calls overridden method
	        super.Message();
	     }
	     
	    
	    
	    
	    /*
     // Example 2
	 // default or no-arg constructor of class Abdullah
		Abdullah() {

	 // calling default constructor of the superclass
	    super();

		    System.out.println("I am a Abdullah");
		  }  */
		}
	    
	  


