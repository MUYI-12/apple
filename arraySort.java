import java.util.Arrays;
public class arraySort{
	public static void main(String args[]){
		int a[]={6,7,5,45,33,336,23,566,10};
		Arrays.sort(a);
		for(int i = 0;i < a.length;i++)
			System.out.print(a[i]+" ");
	}
}