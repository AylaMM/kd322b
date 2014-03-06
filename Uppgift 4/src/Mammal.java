
public abstract class Mammal extends Animal {
	
	private int lactationTime;
	
	public Mammal(boolean alive, int lactationTime){
		
		super(alive);
		this.lactationTime = lactationTime;
		
	}
	
	public int getLactationTime(){
		System.out.println("My lactation tajmz brings all the boys to the yard! And they're like, ''Gimme yo milk beyotch, or I'll shoot you in the fucking tits!'' :'(");
		return lactationTime;
	}

}
