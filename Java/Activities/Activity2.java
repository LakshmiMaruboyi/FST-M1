package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] number= {10, 77, 10, 54, -11, 10};
		for(int i=0;i<=5;i++) {
			System.out.println("10s value is equal to 10.");
			if(number[i]==10) {
				sum= sum+number[i];
				System.out.println("sum value" + sum);
				}
		}
		if(sum==30) {
		System.out.println("10s value is equal to 30.");
		}
		else {
			System.out.println("10s value is not equal to 30.");
			
		}
	}

}
