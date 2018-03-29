package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	private String nombre;
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year)throws DateException{
		this.year=year;
		if(month<1||month>12){
		throw new DateException("mes "+month+" no valido "+"valores posibles entre 1 y 12");
		}
		else{
		this.month=month;
		}
		if(day<1){
		throw new DateException("dia "+day+ " no valido "+" solo se pueden dias mayores que 1");
		}
		else{
			switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day>31){
				throw new DateException("dia "+day+" no valido en este mes");
				}
				else{
				this.day=day;
				}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day>30){
				throw new DateException("dia "+day+" no valido en este mes");
				}
				else{
				this.day=day;
				}
			break;
			case 2:
				if(day>28){
				throw new DateException("dia "+day+" no valido en el mes de febrero");
				}
				else{
				this.day=day;
				}
			break;
			
			}
		}
	}
	public Date(){
	this.day=01;
	this.month=01;
	this.year=2018;	
	
	}
	public Date(Date fecha){
	
	}
	
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}

	boolean isSameYearIf(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}
	boolean isSameMonthIf(Date another){
		if(this.month == another.getMonth()){
		return true;
		}
		return false;
	}
	boolean isSameDayIf(Date another){
		if(this.day==another.getDay()){
			return true;
		}
		return false;
	}
	boolean isSameIf(Date another){
		if((this.year == another.getYear())&&(this.month == another.getMonth())&&(this.day==another.getDay())){
		return true;
		}
		return false;
	}
	String getMonthName(){
	
		switch(getMonth()){
			case 1:
				nombre="enero";
			break;
			case 2:
				nombre="febrero";
			break;
			case 3:
				nombre="marzo";
			break;
			case 4:
				nombre="abril";
			break;
			case 5:
				nombre="mayo";
			break;
			case 6:
				nombre="junio";
			break;
			case 7:
				nombre="julio";
			break;
			case 8:
				nombre="agosto";
			break;
			case 9:
				nombre="septiembre";
			break;
			case 10:
				nombre="octubre";
			break;
			case 11:
				nombre="noviembre";
			break;
			case 12:
				nombre="diciembre";
			break;
		}
		return nombre;
				
	}
	String getMonthSeason(){
		String estacion=" ";
		switch(this.month){
		case 1:
		case 2:
		case 3:
			estacion="invierno";
		break;
		case 4:
		case 5:
		case 6:
			estacion="primavera";
		break;
		case 7:
		case 8:
		case 9:
			estacion="verano";
		break;
		case 10:
		case 11:
		case 12:
			estacion="otoño";
		break;
		}
	return estacion;
	}
	boolean isDayRight(int num){// a que se refiere con que verifica si el dia del mes es correcto
		boolean verificacion=false;
		if(getDay()<=31){
			switch(getDay()){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					 verificacion=true;
			break;
			}
		}
		if(getDay()<=30){
			switch(getDay()){
			case 4:
			case 6:
			case 9:
			case 11:
				verificacion=true;
			break;
			}
		}
		if(getDay()<=28){
			switch(getDay()){
			case 2:
				verificacion=true;
			break;
			}
		}
	return verificacion;
	}
	String monthsLeft(){
	StringBuilder months=new StringBuilder();
		for(int i=this.month+1;i<=12;i++){
		months.append(this.getMonthName());
		}
	return months.toString();
	}
		
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

}































