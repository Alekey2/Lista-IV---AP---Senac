import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a[] = {1,2,3,4,5};
	    int s = 0;
	    System.out.println("Digite um valor para ver se ele está presente neste vetor: ");
	    int x = sc.nextInt();
	    
	    for(int i = 0;i<a.length;i++){
	         s = a[i];
	         break;
	    }
	        if(x>0 && x<6){
	            System.out.println("O valor digitado está presente nesse vetor ");
	          
	        }
	        else
	         System.out.println("O valor digitado não está presente neste vetor ");
	    
	}
}


