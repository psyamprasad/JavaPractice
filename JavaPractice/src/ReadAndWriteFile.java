import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class ReadAndWriteFile {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		/*
	    FileInputStream fin=new FileInputStream("D:\\readandwrite\\testout.txt");
	    int i=0;
	    String str;
	    while((i=fin.read())!=-1)
	    {
	    	System.out.print((char)i);
	    }
	    fin.close();
	    */
		
		 // PrintWriter object for output.txt
       // PrintWriter pw = new PrintWriter("output.txt");
		PrintWriter pw = new PrintWriter("D:\\readandwrite\\output.txt");
         
        // BufferedReader object for input.txt
        BufferedReader br1 = new BufferedReader(new FileReader("D:\\readandwrite\\testout.txt"));
         
        String line1 = br1.readLine();
         
        // loop for each line of input.txt
        while(line1 != null)
        {
            boolean flag = false;
             
            // BufferedReader object for output.txt
            BufferedReader br2 = new BufferedReader(new FileReader("output.txt"));
             
            String line2 = br2.readLine();
             
            // loop for each line of output.txt
            while(line2 != null)
            {
                 
                if(line1.equals(line2))
                {
                    flag = true;
                    break;
                }
                 
                line2 = br2.readLine();
             
            }
             
            // if flag = false
            // write line of input.txt to output.txt
            if(!flag){
                pw.println(line1);
                 
                // flushing is important here
                pw.flush();
            }
             
            line1 = br1.readLine();
             
        }
         
        // closing resources
        br1.close();
        pw.close();
         
        System.out.println("File operation performed successfully");
    
}

	

}
