import java.util.Scanner;
public class Main{
        
        public static int matriz(int a[][]){
            int maior = 0;
            for(int i = 0;i<a.length;i++){
                for(int j= 0;j<a[i].length;j++){
                    if(a[i][j]>maior){
                        maior=a[i][j];
                    }
               
                }
            }
           
        
            
            return maior;
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor da matriz\n");
            System.out.println("Quantidade de linhas");
            int N = sc.nextInt();
            System.out.println("Quantidade de Colunas");
            int M = sc.nextInt();
            int a[][]= new int [N][M];
            for(int i = 0;i<a.length;i++){
                for(int j= 0;j<a[i].length;j++){
                    System.out.println("Digite o valor da Linha "+i+" Coluna "+j);
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i = 0;i<a.length;i++){
                for(int j= 0;j<a[i].length;j++){
                   System.out.print(a[i][j]+"\t");
                }
                System.out.println("");
            }
            int r = matriz(a);
            
            System.out.println("\nO maior valor da matriz é: "+r);
        }
}