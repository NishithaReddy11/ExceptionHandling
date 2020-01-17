package project1;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(10125,"Mahesh",50000
				);
		EmployeeAdder empAdd=new EmployeeAdder();
		try {
		empAdd.AddEmploye(emp);
	}
		catch(Exception e)
		{
			System.out.println("Error is:"+e.getMessage());
		}
	}

}
