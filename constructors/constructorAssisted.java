package constructors;

public class constructorAssisted {

	int empId;
	String empName ;
	String empType ;
	int empSalary;	

	public constructorAssisted() {
		 empId = 1111;
		 empName = "Kishore";
		 empType = "Full time";
		 empSalary = 30000;	
	}
	
	public constructorAssisted(int empId,String empName,String empType,int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empType = empType;
		this.empSalary = empSalary;
		
	}
	public void display() {
		System.out.println("");
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empType);
		System.out.println(empSalary);
	}
	
	public static void main(String[] args) {
		constructorAssisted obj = new constructorAssisted();
		constructorAssisted obj1 = new constructorAssisted(1112,"Monesh","Part time",50000);
		 
		        obj.display();
				
				obj1.display();
	}
}
