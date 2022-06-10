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
            
            
     for(int i =0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                   System.out.println("Digite um número para a posição "+"Linha "+i+" Coluna "+j);
                   a[i][j]=sc.nextInt();
                   }
            }
           for(int i =0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                 
                   System.out.print(a[i][j]+"\t");
                    
                   }
                     System.out.println("");
                     
               }
                System.out.println("Digite um número para ver se ele está dentro da matriz: ");
                int ale = sc.nextInt();
                
               for(int i =0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                  
                    if(ale==a[i][j]){
                   System.out.println("\nA posição do número "+ale+" é "+"Linha "+i+" Coluna "+j);
                    }
                   }
                     
               }
        }
    }
            
    


