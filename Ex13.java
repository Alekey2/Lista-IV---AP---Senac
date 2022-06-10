import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {
        int a[]={2,4,6,8};
	    
	    int b[]={1,3,5,7};
	    
	    int []c = new int [a.length + b.length];
		int x = 0;
	    
		for(int i = 0; i < a.length; i++){
			c[x++] = a[i];
			
		}
		for(int i = 0; i < b.length; i++){
			c[x++] = b[i];
		}
		System.out.println(Arrays.toString(c));
    }
}
    	
		