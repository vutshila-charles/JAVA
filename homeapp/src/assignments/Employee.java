package assignments;
//HLONGWANE ad CHAVALALA

public class Employee {

	private String EmpName;
	private String EmpSurname;
	private String EmpDept;
	private int EmpNum;
	
	
	
	public Employee(String empName, String empSurname, String empDept, int empNum) {
		
		EmpName = empName;
		EmpSurname = empSurname;
		EmpDept = empDept;
		EmpNum = empNum;
	}



	public Employee() {
		
		// TODO Auto-generated constructor stub
	}



	public String getEmpName() {
		return EmpName;
	}



	public void setEmpName(String empName) {
		EmpName = empName;
	}



	public String getEmpSurname() {
		return EmpSurname;
	}



	public void setEmpSurname(String empSurname) {
		EmpSurname = empSurname;
	}



	public String getEmpDept() {
		return EmpDept;
	}



	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}



	public int getEmpNum() {
		return EmpNum;
	}



	public void setEmpNum(int empNum) {
		EmpNum = empNum;
	}



	@Override
	public String toString() {
		return String.format("%s%s%s%d", EmpName,EmpSurname,EmpDept,EmpNum);
	}
	
	
	
}
