import java.io.IOException;

public class HelloWorld
{
	 public static int [][] compute (int [][] a , int [][] b){
	       
		 int [][] erg = new int [a.length][a.length];
	       
	        int i=0;
	        int j=0;
	        int k=0;
	       //durch scharfes Hinsehen als falsch befunden!
	        while (i<a.length){
	           
	            while (j<a.length){
	               
	                while (k<a.length){
	                   
	                    erg [i][j] += a[i][k] * b[k][j];
	                    k++;
	       
	                }
	                System.out.print(erg[i][j] + " ");
	                j++;
	               
	            }
	            System.out.println(" ");
	            i++;
	        }
	       
	        return erg;
	    }
	 
	 
	public static void main(String[] args)
			throws IOException
	{
		//System.out.println("Hello World!") ;
		int [][] a = {{1,2}, {2,1}};
        int [][] b = {{2,1}, {3,4}};
       
        HelloWorld.compute(a, b);
	}
}
