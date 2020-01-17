package project1;

public class EmployeeAdder {
	public void AddEmploye(Employee emp) throws Exception
	{
		if(emp.getEmpid()<10000 || emp.getEmpid()>99999)
		{
			throw new InvalidEmployeeIdException("Inavlid Id");
		}
		if(emp.getEname().length()<3)
		{
			throw new InvalidEmployeeNameException("Inavlid Name");
		}
		if(emp.getSalary()<30000 || emp.getSalary()>80000)
		{
			throw new InvalidEmployeeSalaryException("Inavlid Salary");
		}
		System.out.println("Added Sucessfully");
	}
}
