package homeapp.SAMUELS_hLONGWANE_SEARCHING;
//HLONGWANE AND SAMUELS
public class Employee {
	private String EmpName;
	private String EmpSurname;
	private String EmpDept;
	private String EmpRank;
	private int EmpNum;
	
	
	
	public Employee(String empName, String empSurname, String empDept, String empRank, int empNum) {
		super();
		EmpName = empName;
		EmpSurname = empSurname;
		EmpDept = empDept;
		EmpRank = empRank;
		EmpNum = empNum;
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
	public String getEmpRank() {
		return EmpRank;
	}
	public void setEmpRank(String empRank) {
		EmpRank = empRank;
	}
	public int getEmpNum() {
		return EmpNum;
	}
	public void setEmpNum(int empNum) {
		EmpNum = empNum;
	}

	public Employee() {
		super();
		
	}

	@Override
	public String toString() {
		return String.format("Name: %s \nSurname: %s \nDepartment : %s \nRank: %s \nEmployee Number: %d",getEmpName(),getEmpSurname(),getEmpDept(),getEmpRank(),getEmpNum());
	}
	

}
