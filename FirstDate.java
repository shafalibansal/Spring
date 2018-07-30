package practice;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


public class FirstDate {

	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(1993,Month.APRIL,26);
		LocalDate now = LocalDate.now();
		Period p = Period.between(dob, now);
		System.out.println(p.getYears());
		System.out.println(p.get(ChronoUnit.YEARS));
		System.out.println(dob.until(now,ChronoUnit.MONTHS));
		
		//With stream
		List<LocalDate> li = new ArrayList<>();
		li.add(LocalDate.of(1993,Month.APRIL,26));
		li.add(LocalDate.of(1987,Month.MAY,18));
		li.add(LocalDate.of(1995,Month.DECEMBER,20));
		li.add(LocalDate.of(1990,Month.OCTOBER,23));
	    //List<List<LocalDate>> l = Arrays.asList(li);
	    //l.stream().forEach(System.out::println);
	    for(LocalDate ld: li){
	    	System.out.println(ld);
	    }
	    int i = 0;
	    li.stream().map(y -> (Period.between(y,LocalDate.now())).getYears()).forEach(System.out::println);
	    
		
	}
}
