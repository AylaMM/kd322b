
public class wtfDog extends Mammal {
	
	private boolean barks;
	
	public wtfDog(boolean alive, int lactationTime, boolean barks){
		super(alive, lactationTime);
		this.barks = barks;
	}

	@Override
	public String getInfo(){
		String info = "I hate dogs (if false = true. Always true.): " + super.getAlive() + ". Gross milk (litres per second. Or years, I don't care): " + super.getLactationTime() + ". \n Make it stop. I can't stand the sound. I hate this spawn of-- OUCH, ASS!! IT BIT ME! It's spraying its milk... \n everywhere... " + barks;
		return info;
	}
}
