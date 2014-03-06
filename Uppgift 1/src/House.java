// Klassnamn
	public class House{    
		// Instansvariabler
		private int year;    
		private int size;    
		// Klassvariabler
		private static int nbrOfHouses;   
		// Att klassvariabeln är "final" innebär att programmet inte kan/kommer modifiera variabeln (om inget default-värde ges, så kan ett värde enbart
		//definieras en gång. Samt hjälper kompilatorn att optimisera en del av koden.
		public static final int MIN_SIZE =10;    
		
		// Konstruktor (heter samma som klassen)
		public House(int _year,int _size){       
			year = _year;
			size = _size;
			if(size < 10){
				size = MIN_SIZE;
			}
				nbrOfHouses++;
			}    
		
		// Klassmetod
		public static int getNbrHouses(){       
			return nbrOfHouses;    
			}   
		// Instansmetod
		public int getYear(){       
			return year; 
			}    
		// Instansmetod
		public int getSize(){       
			return size;  
			} 
		}
