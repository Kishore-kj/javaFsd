package Array;

public class multidArray {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Printing 3rd element "+arr[0][2]);
		System.out.println("Printing 1st elemnt in second row "+arr[1][1]);
		
		for(int i = 0;i <3;i++) {
			for(int j = 0;j<3;j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println("\n");
		}
	}
	
	

}
