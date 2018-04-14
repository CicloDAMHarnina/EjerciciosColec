package ejercicios02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AyudaTiempo {
public static void main(String[] args) {
	LocalDate localDate=LocalDate.now();
	System.out.println(localDate.getEra());
	LocalDateTime localDateTime;
	LocalTime localTime=LocalTime.now();
	System.out.println(localTime.getNano()-LocalTime.now().getNano());
}
}
