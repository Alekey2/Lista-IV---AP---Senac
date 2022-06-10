import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o tamanho do vetor: ");
	    int b = sc.nextInt();
	    int a[] = new int [b];
	    int soma = 0;
	    
	    for(int i = 0;i<a.length;i++){
	       System.out.println("Digite o número da linha "+i+" do vetor: ");
	        a[i]=sc.nextInt();
	
	    }
	    
	    for(int i = 0;i<a.length;i++){
	        soma += a[i];
		
	    }
	    System.out.println("\nA média da soma de todos elementos do vetor é:\n"+soma/b);
	}
}



