import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		LocalDate lt=LocalDate.of(1996,05,15);
		LocalDate lt1=LocalDate.of(2023,03,22);
		
		Period d=Period.between(lt, lt1);
		System.out.println(d.getYears());
		

	}

}
