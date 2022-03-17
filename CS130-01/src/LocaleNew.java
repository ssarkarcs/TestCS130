import java.util.Locale;

public class LocaleNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale1 = new Locale("ru", "Russia");  
		  
	      // print locale  
	      System.out.println("Locale: " + locale1);  
	  
	      // print language  
	      System.out.println("Language: " + locale1.getDisplayLanguage());  
	     
	      // print country   
	      System.out.println("Country Name: "  
	                                 + locale1.getDisplayCountry()); 
	}

}
