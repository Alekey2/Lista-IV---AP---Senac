public class Main
{
	public static void main(String[] args) {
	    int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

          System.out.println("Foram retirado os números das Linhas e Colunas mencionadas abaixo:\n ");
	      for(int i = 0; i<4;i++){
	        for(int j= 0;j<4;j++){
	            
	            if(i<j){
	                System.out.println("Linha "+i+" Colunas "+j+"\n"+a[i][j]);
	            }
	            }
	      }
	}
}
	        

