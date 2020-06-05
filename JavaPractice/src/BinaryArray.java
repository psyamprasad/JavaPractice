
public class BinaryArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BinaryArray b=new BinaryArray();
		int arr[]= {1,1,0,1,1,1};
		int res=b.maxConsequtiveOnes(arr);
		System.out.println(res);

	}
	
	public int maxConsequtiveOnes(int[] arr)
	   {
	      int max = 0;
	      int temp = 0;
	      for(int i = 0; i < arr.length; i++)
	      {
	         if(arr[i] == 1)
	         {
	            temp++;
	         }
	         else
	         {
	            temp = 0;
	         }
	         max = Math.max( temp, max );
	      }
	      return max;
	   }
	

}
