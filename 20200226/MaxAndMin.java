public class MaxAndMin {
	public static void main(String[] args) {
		int num1=1;
		int num2=2;
		int num3=3;
		int tmp=0; 
		if(num1<num2) {
			tmp=num1;
			num1=num2;
			num2=tmp;
		}
		if(num1<num3) {
			tmp=num1;
			num1=num3;
			num3=tmp;
		}
		if(num2<num3) {
			tmp=num2;
			num2=num3;
			num3=tmp;
		}
		System.out.println("max="+num1);
		System.out.println("min="+num3);
	}
}
