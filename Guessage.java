import java.util.Scanner;
public class Guessage{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�������䣺");
		int age = scan.nextInt();
		
		age /= 18;
		switch(age){
			case 0:
			System.out.println("С���"); //С��18
			break;
			case 1:
			System.out.println("����");//18~35
			break;
			default :
			System.out.println("����");//36~
		}
	}
	
}