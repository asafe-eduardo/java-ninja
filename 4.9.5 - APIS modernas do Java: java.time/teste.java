import java.time.*;
import java.time.format.DateTimeFormatter;

class teste {
	
	public static void main(String... args) { 
		LocalDate hoje = LocalDate.now();
		LocalDate nascimento = LocalDate.of(1997, 05, 26);
		
		
		LocalDateTime hojeComHora = LocalDateTime.now();
		System.out.println(hojeComHora);
		
		Period idade = Period.between(nascimento, hoje);
		System.out.println("Idade: " + idade.getYears());
		
		Instant agoraUTC = Instant.now();
		ZonedDateTime saoPaulo = agoraUTC.atZone(ZoneId.of("America/Sao_Paulo"));
		
		System.out.println("UTC: " + agoraUTC);
		System.out.println("SP: " + saoPaulo);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss  dd/MM/yyyy");
		System.out.println("formatado: " + saoPaulo.format(fmt));
		
		
	}
}
		
