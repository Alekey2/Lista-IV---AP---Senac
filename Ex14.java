import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    
	    int a[]={2,4,6,8};
	    
	    int b[]={1,3,5,7};
	    
	    int []c = new int [a.length + b.length];
	 
			for(int i= 0,j=0; i <a.length;j++,i++){
			    c[i] = a[i];
			       System.out.println(c[i]);
			        c[j] = b[j];
			       System.out.println(c[j]);
			}
			
			
	}
}


