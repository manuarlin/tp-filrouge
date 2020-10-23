# TP Formatage

## Date
* Afficher la date du jour 
* Afficher la date du jour en texte au format ENGLISH 
* Afficher la date du jour au format dddd/MM/yyyy

## Nombre
* Afficher un nombre à virgule avec un point ("12.12") 
* Afficher le même nombre avec une virgule ("12,12")
* Afficher le le même nombre arrondis à une décimal après la virgule ("12,1")
* Afficher avec la currency 


```java 

public static void main(String[] args) {
		Locale[] locales = Locale.getAvailableLocales();
		for(Locale l : locales) {
			System.out.println(l);
		}
		
		System.out.println("current locale");
		
		System.out.println(Locale.getDefault());
		
		
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy")
				.withLocale(Locale.FRANCE);
		
		System.out.println(fmt.format(ZonedDateTime.now()));
		
		
		System.out.println("java 8 ");
		
		
		DateFormat fmt2 = DateFormat.getDateInstance(DateFormat.LONG,Locale.ENGLISH);
		System.out.println(fmt2.format(new Date()));
		
		
		System.out.println("Number format");
		
		NumberFormat fmtn = NumberFormat.getInstance(Locale.FRANCE);
		
		System.out.println(fmtn.format(123.123));
		
		fmtn.setRoundingMode(RoundingMode.DOWN);
		fmtn.setMaximumFractionDigits(2);
		
		System.out.println(fmtn.format(123.456));
		
		
		NumberFormat fmtc = NumberFormat.getCurrencyInstance(Locale.CANADA);
		System.out.println(fmtc.format(12));
	}
  
  ```
