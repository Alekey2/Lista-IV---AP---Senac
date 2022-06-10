import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o valor para d: ");
	    int d = sc.nextInt();
	    float a[]={10,15,25,36};
	    for(int i=0,j=0; i<a.length; i++){
	        System.out.println("O produto dos dois vetores é: ");
	        System.out.println(a[i]*d);
	      
	    }
		
	}
}

