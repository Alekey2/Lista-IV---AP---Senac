import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int x =0;
	    x++;
	    System.out.println("Digite a nota do "+ x +"º aluno: ");
	    int a = sc.nextInt();
	    x++;
	    System.out.println("Digite a nota do "+ x +"º aluno: ");
	    int b = sc.nextInt();
	    x++;
	    System.out.println("Digite a nota do "+ x +"º aluno: ");
	    int c = sc.nextInt();
	
	  
	    float v = 0;
	    
	    String NAlunos[] = {"\nAlex","Vinicius","Lucas"};
	    int notas[] = {a,b,c};
	    
	    for(int i=0;i<NAlunos.length;i++){
	        v += notas[i];
	        System.out.println(NAlunos[i]);
	         System.out.println(notas[i]);
	         
	    }
	    
	     System.out.println("\nA média da sala é: "+v/3);
	     
	     if(a>6){
	         System.out.println("\nAlex teve a nota acima da média");
	     }
	        if(b>6){
	         System.out.println("\nVinicius teve a nota acima da média");
	    }
	       if(c>6){
	         System.out.println("\nLucas teve a nota acima da média");
	       }
	}
}



