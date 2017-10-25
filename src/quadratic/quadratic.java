package quadratic;

public class quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double array1[] = new double [2];
		array1= quadEqn(1,-7,12);
		System.out.println(array1[0]+ " " + array1[1]);
	}
	public static double[] quadEqn(double a, double b, double c) {
		double array1[] = new double [2];
		array1[0]= (-1* b + Math.sqrt(b*b-4*a*c))/(2*a);
		array1[1]= (-1* b - Math.sqrt(b*b-4*a*c))/(2*a);
		return array1;
	}
}
