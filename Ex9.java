import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o valor para d: ");
	    int d = sc.nextInt();
	    System.out.println("Digite o valor para e: ");
	    int e = sc.nextInt();
	    int a[]={d};
	    int b[]={e};
	    int c[]= new int[a.length+b.length];
	    for(int i=0,j=0; i<c.length; i+=2,j++){
	        System.out.println("O produto dos dois vetores é: ");
	        c[i]=a[j]*b[j];
	        System.out.println(c[i]);
	      
	    }
		
	}
}




