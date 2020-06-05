import java.util.StringTokenizer;

public class StringSplit {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		/*
		 * String name="JOHN DEO"; String firstname=""; String secondname="";
		 * System.out.println(name); if(name.contains(" ")) {
		 * System.out.println("space have"); String []names=name.split("\\s");
		 * name=names[0]; firstname=names[1]; //secondname=names[1];
		 * System.out.println(name); System.out.println(firstname);
		 * //System.out.println(secondname);
		 * 
		 * 
		 * } else { System.out.println("no space"); }
		 */
		
		
		
		/*
		String name="JOHN DEO";
		String firstname="";
		String secondname="";
		System.out.println(name);
		
		 StringTokenizer tokenizer = new StringTokenizer(name, " ");
	        
	        while (tokenizer.hasMoreTokens()) {
	           // System.out.println(tokenizer.nextToken());
	        	name=tokenizer.nextToken();
	            firstname=tokenizer.nextToken();
	            //secondname=tokenizer.nextToken();
	            System.out.println(name);
	            System.out.println(firstname);
		       // System.out.println(secondname);
		        	            
	        }
	        */
		
		   String name="JOHN DEO majji";
		   String firstname=""; 
		   String secondname="";
		   System.out.println(name); 
		   if(name.contains(" ")) 
		   {
		       System.out.println("space have"); 
		       String []names=name.split("\\s");
               for(int i=0;i<names.length-1;i++)
               {
            	   name=names[i];
            	   firstname=names[++i];
            	   
               }

		       System.out.println(name); 
		       System.out.println(firstname);
		      //System.out.println(secondname);
		  
		  
		  } else { System.out.println("no space"); }
	        
	       

	}

}
