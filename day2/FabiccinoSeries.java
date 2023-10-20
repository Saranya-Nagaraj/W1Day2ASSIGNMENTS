package week1.day2;

public class FabiccinoSeries {

	public static void main(String[] args) {
		
		        int n = 10; 

		        System.out.println("Fibonacci Series with " + n + " terms:");
		        printFibonacciSeries(n);
		    }

		    public static void printFibonacciSeries(int n) {
		        int first = 0;
		        int second = 1;

		        for (int i = 0; i < n; i++) {
		            System.out.print(first + " ");
		            int next = first + second;
		            first = second;
		            second = next;
		        }
		    }
		}


	


