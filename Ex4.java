import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     System.out.println("Digite o tamanho do vetor: ");
	    int b = sc.nextInt();
	    float a[] = new float [b];
	    float menor = 0;
	    
	    for(int i = 0;i<a.length;i++){
	        System.out.println("Digite o número da linha "+i+" do vetor: ");
	        a[i]=sc.nextInt();
	        menor++;
	    }
	    
	    for(int i = 0;i<a.length;i++){
	        if(a[i]<menor){
	        menor = a[i];
	        
	        }
	    }
	    System.out.println("\nO menor número deste vetor é:\n"+menor);
	}
}



