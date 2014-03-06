// Klassnamn
	public class House{    
		// Instansvariabler
		private int year;    
		private int size;    
		// Klassvariabler
		private static int nbrOfHouses;   
		// Att klassvariabeln �r "final" inneb�r att programmet inte kan/kommer modifiera variabeln (om inget default-v�rde ges, s� kan ett v�rde enbart
		//definieras en g�ng. Samt hj�lper kompilatorn att optimisera en del av koden.
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
