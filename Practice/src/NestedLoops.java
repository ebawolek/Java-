
public class NestedLoops {

	public static void main(String[] args) {
		int height = 4;
		int width = 3;
		for (int row = 1; row <= height; row++){//outer loop iterates the equivalent to the height
			for(int col = 1; col <= width; col++)//for each iteration of outer loop,
			{									 //inner loop iterates to the columns are equivalent to the width
				System.out.print("*");
			}
			System.out.println("");			
		}
	}
}
