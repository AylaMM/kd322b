
public class Snake extends Animal {
	
	private boolean poisonous;
	
	public Snake(boolean alive, boolean poisonous){
		super(alive);
		this.poisonous = poisonous;
	}

	
	@Override
	public String getInfo(){
		String info = "IT'S ALIIIIVE. Well, maybe: " + super.getAlive() + " Sofuckingpoisonouuus, maybe: " + poisonous;
		return info;
	}
}
