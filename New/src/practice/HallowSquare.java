package practice;

public class HallowSquare {

	
	public static void main(String[] args) {
		
		int space=3;
		for(int i=1;i<=5;i++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int i=1;i<=3;i++) {
			System.out.print("*    ");
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			System.out.print("*    ");
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			System.out.print("* ");
		}
		
	}
}
