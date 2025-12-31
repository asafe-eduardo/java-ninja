import java.util.Locale;
import java.util.ResourceBundle;

class teste {
	
	public static void main(String... args) throws Exception{
		Locale ptBR = new Locale("pt", "BR");
		Locale enUS = Locale.US;
		
		ResourceBundle rbPt = ResourceBundle.getBundle("messages", ptBR);
		ResourceBundle rbEn = ResourceBundle.getBundle("messages", enUS);

		System.out.println(rbPt.getString("app.welcome"));
		System.out.println(rbEn.getString("app.welcome"));
	}
}
		
