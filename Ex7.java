import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o tamanho do vetor: ");
	    int b = sc.nextInt();
	    int a[] = new int [b];
	    System.out.println("Digite um valor para multiplicar por todos elementos do vetor: ");
	    float s = sc.nextInt();
	    
	    for(int i = 0;i<a.length;i++){
	       System.out.println("Digite o número da linha "+i+" do vetor: ");
	        a[i]=sc.nextInt();
	
	    }
	   
	    
	    for(int i = 0;i<a.length;i++){
	        s *= a[i];
		
	    }
	    System.out.println("\nA multiplicação de todos os elementos por um número real é:\n"+s);
	}
}




