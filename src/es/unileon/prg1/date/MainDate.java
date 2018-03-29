package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
	try{	
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		System.out.println(today.toString());
		System.out.println(tomorrow.toString());
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYearIf(tomorrow));
		System.out.println(today.getMonthName());
	}catch (DateException e){
		System.out.println(e.getMessage());
		}
		
	

}
}
