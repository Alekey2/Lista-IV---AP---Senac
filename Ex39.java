import java.util.Scanner;
import java.util.Arrays;
public class Main{
    
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o tamanho da matriz\n");
        System.out.print("Quantidade de Linhas: ");
        int N = sc.nextInt();
        System.out.print("Quantidade de Colunas da Primeira matriz/Linhas segunda matriz: ");
        int M = sc.nextInt();
        System.out.print("Quantidade de Colunas da segunda matriz: ");
        int P = sc.nextInt();
	    int a [][] = new int [N][M];
	    int b [][] = new int [M][P];
	    float soma =1;
	    float soma1=1;
	    int r = M;
	    int s = P;
	   for(int i =0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               
               a[i][j]=s;
               soma*=a[i][j];
   
               System.out.print(a[i][j]+"\t");
               
               }
             System.out.println("");
              
        }
        System.out.println("");
        for(int i =0;i<b.length;i++){
           for(int j=0;j<b[i].length;j++){
               
               b[i][j]=r;
               soma1*=b[i][j];
   
               System.out.print(b[i][j]+"\t");
               
               }
             System.out.println("");
              
        }
        System.out.println("O Produto da primerira matriz é: "+soma);
        System.out.println("O Produto da segunda matriz é: "+soma1);
       
       
    }
}
