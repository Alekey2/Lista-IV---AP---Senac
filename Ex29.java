import java.util.Scanner;
import java.util.Arrays;
public class Main{
    
	public static void main(String[] args) {
	    int a [][] = new int [4][4];
	    int b [] = {0,1,2,3};
	   
	   System.out.println("Os números do vetor foram inseridos nas linhas\n");
	   
	   for(int i =0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               
               a[i][j]=b[j];
               System.out.print(a[i][j]+"\t");
               
               }
             System.out.println("");
              
        }
       
    }
}


