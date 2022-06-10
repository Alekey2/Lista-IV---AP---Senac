import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite as notas do primeiro aluno: ");
	    float x = sc.nextFloat();
	    float y = sc.nextFloat();
	    float z = sc.nextFloat();
	    float w = sc.nextFloat();
	    System.out.println("Digite as notas do segundo aluno: ");
	    float f = sc.nextFloat();
	    float g = sc.nextFloat();
	    float h = sc.nextFloat();
	    float k = sc.nextFloat();
	   
	    float a[] = {x,y,z,w};
	    float b[] = {f,g,h,k};
	    float soma = 0;
	    float soma1 = 0;
	    for(int i = 0, j=0;i<a.length;j++,i++){
	        soma += a[i];
	        soma1 += b[j];
	    }
	    if(soma>soma1){
	            System.out.println("\nA maior soma é do aluno A = " + soma);
	        }
	        else
	        System.out.println("\nA maior soma é do aluno B = "+ soma1);
	    if(soma>soma1){
	        System.out.println("\nA menor média é do aluno B = "+soma1/4);
	    }
	    else 
	    System.out.println("\nA menor média é do aluno A = " + soma/4);
	
	}
}
