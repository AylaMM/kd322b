/*
 * abstract class betyder att man inte kan skapa instanser av den klassen
 * eftersom det inte finns ett objekt som är ett generiskt djur
 * WOOP
 */

public abstract class Animal {
	
	private boolean alive;
	
	public Animal(boolean alive){
		this.alive = alive;
	}
	
	public boolean getAlive(){
		return alive;
	}
	
	public abstract String getInfo();

}
