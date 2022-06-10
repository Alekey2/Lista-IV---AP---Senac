import java.util.Scanner;
public class Main{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o tamanho para matriz \n");
            System.out.println("Digite quantas linhas: ");
            int N = sc.nextInt();
            System.out.println("Digite quantas colunas: ");
            int M = sc.nextInt();
            int a[][] = new int [N][M];
            int linhas = 0;
            int colunas = 0;
            int zero;
            
     for(int i =0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                   System.out.println("Digite um número para a posição "+"Linha "+i+" Coluna "+j);
                   a[i][j]=sc.nextInt();
                   }
            }
           for(int i =0;i<N;i++){
               for(int j=0;j<M;j++){
                   System.out.print(a[i][j]+"\t");
                   }
                     System.out.println("");
               }
           for(int i =0;i<a.length;i++){
               zero = 0;
               for(int j=0;j<a[i].length;j++){
                   if(a[i][j]==0){
                   zero++;
                   }
               }
                if(zero==M){
                       linhas++;
                   }
              
           }
            System.out.println("Linhas nulas : "+linhas);
             
              for(int j =0;j<M;j++){
               zero = 0;
               for(int i=0;i<N;i++){
                   if(a[i][j]==0){
                   zero++;
                   }
               }
                if(zero==N){
                       colunas++;
                   }
           }
             System.out.println("Colunas nulas : "+colunas);
        }
    }
            