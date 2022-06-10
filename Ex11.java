import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    
	    float a[]={1,2,3,4,5,6,7,8,9};
	    float media = 0;
        float result = 0;
			for(int i= 0; i<a.length;i++){
			    if(a[i]%2==0){
			        media += a[i]/4;
			    }
			    }
			    System.out.println("Valor da média da posição pares do vetores = "+media);
			    for(int j=0;j<a.length;j++){
			        
                    if(a[j]>media){
                        System.out.println("É maior do que a média da posição par do vetor = "+a[j]);
                        
			        }
	}
}
}

