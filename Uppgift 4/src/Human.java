
public class Human {
	
	// final"-icke-variabler" skrivs alltid med stora bokstäver
	public static final int MIN_LENGTH = 3;
	
	private Dog dog;
	private String name;
	
	public Human(String leName){
		name = leName;
	}
	
	public String getName(){
		return name;
	}
	
	public void buyDog(Dog leDog){
		this.dog = leDog;
	}
	
	public String getInfo(){
		if (name != null && dog != null){
			return (name + " pwnz a dawg called " + dog.getName());
		}else if (name != null && dog == null){
			return (name + " doesn't pwn a dawg, ermahgerdz?!");
		}else{
		return null;
	}
	}
}

