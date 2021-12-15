import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1= LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2= LocalDate.of(2020,14,14);
		System.out.println(d2);
		
		LocalDate d3=LocalDate.parse("2019-02-19");
		System.out.println(d3);
		
		System.out.println(d1.plusDays(10));
		System.out.println(d2.plus(2, ChronoUnit.WEEKS));
		
		System.out.println(d2.plus(2, ChronoUnit.MONTHS));
		System.out.println(d3.plus(1, ChronoUnit.YEARS));
		
		System.out.println(d2.getDayOfWeek());
		System.out.println(d1.isLeapYear());
		
		//Write to calculate age
		
		
		
		

	}

}
