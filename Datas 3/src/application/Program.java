package application;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		System.out.print("Digite a data e hora do Check-in: ");
		String in = sc.nextLine();
		
		System.out.print("Digite a data e hora do Check-out: ");
		String out = sc.nextLine();
		
		LocalDateTime checkIn = LocalDateTime.parse(in,fmt);
		LocalDateTime checkOut = LocalDateTime.parse(out,fmt);
		
		
		long horas = Duration.between(checkIn , checkOut) .toHours();
		
		if(horas < 1) {
			System.out.println("A estadia foi de 1 Hora.");
		} else {
			System.out.println("A estadia foi de " + horas + " Horas");
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
