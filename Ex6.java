import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o tamanho do vetor: ");
	    int b = sc.nextInt();
	    int a[] = new int [b];
	    int produto = 1;
	    
	    for(int i = 0;i<a.length;i++){
	       System.out.println("Digite o número da linha "+i+" do vetor: ");
	        a[i]=sc.nextInt();
	
	    }
	    for(int i = 0;i<a.length;i++){
	        produto *= a[i];
		
	    }
	    System.out.println("\nO Produto da multiplicação de todos os elementos do vetor é:\n"+produto);
	}
}



