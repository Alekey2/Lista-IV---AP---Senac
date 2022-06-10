import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    
	    int a[]={4,1,8,6,9,3,2,7,5,10};
	    int aux = 0;
	    Arrays.sort(a);
	    
			for(int i=0; i<a.length;i++){
			    aux =a[i];
			    if(a[i]%2==0){
			        System.out.println(aux);
			    }
			    }
			    for(int j=0;j<a.length;j++){
			    if(a[j]%2==1){
			        System.out.println(a[j]);
			    }
			    }
			     
		
                
    }
}

