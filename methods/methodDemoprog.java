package methods;

public class methodDemoprog {

	int execute1(int a,int b) {
			int c = a*b;
			return c;
		
	}
	
	public static void main(String[] args) {
		methodDemoprog obj = new methodDemoprog();
		int out = obj.execute1(5,6);
		System.out.println(out);
	}

	
}
