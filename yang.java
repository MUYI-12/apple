public class yang{
	public static void main(String[] args){
		int i,j,s;
		for(i = 1;i <= 9;i++){
			for(j = 1;j <=i;j++){
				System.out.print( j + "*" + i + "=" + j*i + "  ");
			}
			System.out.println("\n");
		}
	}
}