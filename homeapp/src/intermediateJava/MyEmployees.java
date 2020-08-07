package intermediateJava;

public class MyEmployees {
	int number;
	String name;
	String SurName;
	String Ranks;
	/**
	 * @return the number
	 */
	
	
	
	public MyEmployees(int number, String name, String surName, String ranks) {
		super();
		this.number = number;
		this.name = name;
		SurName = surName;
		Ranks = ranks;
	}
	
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surName
	 */
	public String getSurName() {
		return SurName;
	}
	/**
	 * @param surName the surName to set
	 */
	public void setSurName(String surName) {
		SurName = surName;
	}
	/**
	 * @return the ranks
	 */
	public String getRanks() {
		return Ranks;
	}
	/**
	 * @param ranks the ranks to set
	 */
	public void setRanks(String ranks) {
		Ranks = ranks;
	}
	

}
