import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a[] = {2,4,6,8,10};
	    int maior = 0;
	    
	    for(int i = 0;i<a.length;i++){
	        if(a[i]>maior)
	        maior = a[i];
		
	    }
	    System.out.println("O maior número deste vetor é:\n"+maior);
	}
}



