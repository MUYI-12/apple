public class work1{
	public static void main(String[] args){
		int res,n1 = 12,n2 = 24,n3 = 16,n4 = 3;
		double d,v1 = 10.0,v2 = 3.1416;
		
		res =n1 / n4;
		System.out.println(res);
		d = n1 / n4;
		System.out.println(d);
		res = n3 / n4;
		System.out.println(res);
		d = n3 / n4;
		System.out.println(d);
		d = v1 / n4;
		System.out.println(d);
		d = v1 / v2;
		System.out.println(d);
		res = n1 / n2;
		System.out.println(res);
		d = (double)n1 / n2;
		System.out.println(d);
		d = n1 / (double)n2;
		System.out.println(d);
		d = (double)(n1 / n2);
		System.out.println(d);
	}
}