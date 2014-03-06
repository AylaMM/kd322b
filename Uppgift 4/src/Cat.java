
public class Cat extends Mammal {
	
	private int lives;
	
	public Cat(boolean alive, int lactationTime, int omgLives){
		super(alive, lactationTime);
		omgLives = lives;
	}
	
	@Override
	public String getInfo(){
		String info = "Alive: " + super.getAlive() + ". Has been bleeding milk for years!! See? -->: " + super.getLactationTime() + ". Lives left: " + lives;
		return info;
	}

}
