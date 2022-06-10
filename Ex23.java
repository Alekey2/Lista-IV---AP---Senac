import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz\n");
        System.out.print("Quantidade de Linhas: ");
        int N = sc.nextInt();
         System.out.print("Quantidade de Colunas: ");
        int M = sc.nextInt();
        int a[][] = new int [N][M];
        int result = 21;
        int r =10;
        for(int i =0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               if(N%2==1){
               a[i][j]=result;
               System.out.print(a[i][j]+"\t");
               }
               else if (N%2==0){
                    a[i][j]=r;
               System.out.print(a[i][j]+"\t");
               }
               }
             System.out.println("");
              
        }
       
    }
}
        
