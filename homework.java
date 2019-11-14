public class homework{
	
			public static void main(String[] args){
				int res,n1 = 12,n2 = 24,n3 = 16,n4 = 3;
				double d,v1 = 10.0,v2 = 3.1416;
				
				res = n1/n4;
				System.out.println("res=" + res);
				
				d = n1/n4;
				System.out.println("d=" + d);
				
				res = n3/n4;
				System.out.println("res=" + res);
				
				d = n3/n4;
				System.out.println("d=" + d);
				
				d = v1/n4;
				System.out.println("d=" + d);
				
				res = n1/n2;
				System.out.println("res=" + res);
				
				d = (double)n1/n2;
				System.out.println("d=" + d);
				
				d = n1/(double)n2;
				System.out.println("d=" + d);
				
				d = (double)(n1/n2);
				System.out.println("d=" + d);
		}
}