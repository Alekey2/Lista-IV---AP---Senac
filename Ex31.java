import java.util.Scanner;
public class Main{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int a[][] = new int [3][3];
            int soma = 0;
            int soma1 = 0;
            int soma2 = 0;
            
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
            
           for(int i =0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                  if(j==0){
                   soma+=a[i][j];
                   
               }
               if(j==1){
                   soma1+=a[i][j];
               }
               if(j==2){
                   soma2+=a[i][j];
                   
               }
             
               
            }   
        
    }
     System.out.println("O resultado da soma da Primera Coluna é: "+soma);
         System.out.println("O resultado da soma da Segunda Coluna é: "+soma1); 
          System.out.println("O resultado da soma da Terceira Coluna é: "+soma2);
}
}
      