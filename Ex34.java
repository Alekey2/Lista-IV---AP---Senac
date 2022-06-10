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
            int soma = 0;
            
     for(int i =0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                   System.out.println("Digite um número para a posição "+"Linha "+i+" Coluna "+j);
                   a[i][j]=sc.nextInt();
                   }
            }
           for(int i =0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                   soma+=a[i][j];
                   System.out.print(a[i][j]+"\t");
                    
                   }
                     System.out.println("");
                     
               }
                System.out.println("A soma de todos os elementos da matriz é : "+soma);
        }
    }
            
    
