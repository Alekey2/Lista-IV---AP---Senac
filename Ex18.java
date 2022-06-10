import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite um valor para encontra-lo dentro do vetor: ");
	    int a = sc.nextInt();
	    int n[] = {1,2,3,4,5,7,8,9};
	    
	    for(int i =0;i<n.length;i++){
	
	    if(a ==n[i]){
	    int pos = Arrays.binarySearch(n,a);
	    System.out.println("posição " + pos);
	    
	    
	        
	    }
	    
	    else if (a>9){
	    System.out.println("Número digitado não encontrado dentro do vetor");
	    break;
	    }
}
	}
}

