
public class Program {
	private String name;
	private String code;
	private int women;
	private int men;
	
	public Program(String name, String code, int women, int men){
		name = this.name;
		code = this.code;
		women = this.women;
		men = this.men;
		
	}

	public String getName(){
		return name;
	}
	public String getCode(){
		return code;
	}
	public int getWomen(){
		return women;
	}
	public int getMen(){
		return men;
	}
}
