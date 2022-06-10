import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	    
	    int b[] = new int [a.length];
		int x = 0;
	    
		for(int i = 0; i < a.length; i++){
		    if(a[i]%3==0)
			b[x++] = a[i];
			
		}
		for (int j=0;j<a.length;j++){
		    if(a[j]%2==0){
		        System.out.println(a[j]);
		    }
		}
	
		System.out.println("Os números multiplos de 3 são: "+Arrays.toString(b));
    }
}
    	

