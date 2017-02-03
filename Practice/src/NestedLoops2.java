//The idea of this program is to produce cascading value of numbers starting at 2 going to 12
//2-----
//-4----
//--6---
//...
public class NestedLoops2 {

	public static void main(String[] args){
		for(int i = 1; i <=6; i++){//outer loop will iterate 6 times creating 6 rows when complete
			for(int k = 1; k <=6; k++){//inner loop will iterate 6 times for every one outer loop creating 6 columns for each row
				if (k==i) //check if the value of k and i are equivalent
					System.out.print(2*k); 
				else
					System.out.print("-");
			}			
			System.out.println();
		}		
	}

}
