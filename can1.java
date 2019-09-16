public class can1{
	public static void main(String[] args){
		int i,j,k;
		for(i = 1;i <= 10;i++){
			for(j = 1;j <= 10 - i;j++){
				System.out.printf(" ");
			}
			for(k = 1;k <= i;k++){
				System.out.printf("$ ");
			}
			System.out.printf("\n");
		}
	}
}