
public class Test {
	public static void main(String[] args) {
		int dey1Moeny=1;
		int sumMoeny=dey1Moeny;
		int dey=10;
		for(int i=2;i<=dey;i++) {
			dey1Moeny*=2;
			sumMoeny+=dey1Moeny;
		}
		System.out.println(sumMoeny);
	}
}