package week1.day2;

public class FindOddNumbers {
	public static void main(String[] args) {
		int MaxRange = 10;
		for (int i = 1; i < MaxRange; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}