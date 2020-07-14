package first;

public enum Days
{
	SUNDAY(1),
	MONDAY(2),
	TUESDAY(3),
	WEDNESDAY(4),
	THURSDAY(5),
	FRIDAY(6),
	SATURDAY(7);
	
	int number;

	public int getNumber() {
		return number;
	}

	private Days(int number) {
		this.number = number;
	}
	
	
	 
	
	

}
