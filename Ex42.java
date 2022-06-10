import java.util.Scanner;
public class Main{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int a[][] = new int [3][3];
            int b[][] = new int [3][3];
            int maior = 0;
            int maior1 = 0;
            
     for(int i =0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                   System.out.println("Digite um número para a posição da Primeira Matriz "+"Linha "+i+" Coluna "+j);
                   a[i][j]=sc.nextInt();
                   }
            }
           for(int i =0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                   System.out.print(a[i][j]+"\t");
                    
                   }
                     System.out.println("");
                     
               }
           for(int i =0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                   if(a[i][j]>maior){
                   maior = a[i][j];
                   }
                    
        }
        
    }
     for(int i =0;i<b.length;i++){
               for(int j=0;j<b[i].length;j++){
                   System.out.println("Digite um número para a posição da Segunda Matriz "+"Linha "+i+" Coluna "+j);
                   b[i][j]=sc.nextInt();
                   }
            }
           for(int i =0;i<b.length;i++){
               for(int j=0;j<b[i].length;j++){
                   System.out.print(b[i][j]+"\t");
                    
                   }
                     System.out.println("");
                     
               }
           for(int i =0;i<b.length;i++){
               for(int j=0;j<b[i].length;j++){
                   if(b[i][j]>maior1){
                   maior1 = b[i][j];
                   }
               }
           }
            System.out.println("O maior número da Primera Matriz é: "+maior);
            System.out.println("O maior número da Segunda Matriz é: "+maior1);
                System.out.println("O Produto da Primera e Segunda Matriz é: "+maior*maior1);
        }
}
            
    


