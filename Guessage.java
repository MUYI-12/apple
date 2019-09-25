import java.util.Scanner;
public class Guessage{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("输入年龄：");
		int age = scan.nextInt();
		
		age /= 18;
		switch(age){
			case 0:
			System.out.println("小姐姐"); //小于18
			break;
			case 1:
			System.out.println("大姐姐");//18~35
			break;
			default :
			System.out.println("大妈");//36~
		}
	}
	
}