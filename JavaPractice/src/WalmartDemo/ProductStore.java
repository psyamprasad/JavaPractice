package WalmartDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductStore 
{
    public void pullbag(int BagQuntity,List<Bag> list)
    {
    	/*
    	Iterator it=list.iterator();
         while(it.hasNext())
         { 
             
            //Object pbj=it.next();
            //System.out.println(pbj.toString());
        	 
        	Bag b=(Bag)it.next();
        	if(BagQuntity<1000)
        	{
        		
        		
        	}
        	System.out.println(b.getProductCap()+"\t"+b.getProductname());
            
         }
         */
    	 for(Bag b:list)
    	 {
    		 int totalValue = 0; 
    		 int current=b.productCap;
    		 if(BagQuntity-current>=0)
    		 {
    			 BagQuntity=BagQuntity-current;
    			
    			 
    		 }
    		 
    	 }
    	
     } 
    public static void main(String arsg[])
    {
    	ProductStore prd=new ProductStore(); 
    	  List list=new ArrayList();
    	  list.add(new Bag("Gold",200));
          list.add(new Bag("Silver",300));
          list.add(new Bag("Cotton",1000));
          list.add(new Bag("Cotton",1000));
    	prd.pullbag(1000, list);
      
    }

}

class Bag
{
   String productname;
   public String getProductname() {
	return productname;
}

public void setProductname(String productname) {
	this.productname = productname;
}

public int getProductCap() {
	return productCap;
}

public void setProductCap(int productCap) {
	this.productCap = productCap;
}

int productCap ;
  // int capacity;
   //Setter & Getters
   
   Bag( String productname, int productCap)
   {
      this.productname=productname;
      this.productCap=productCap;
   }
   
   public String toString()
   {
	   return this.productname+"\t"+this.productCap;
   }
}