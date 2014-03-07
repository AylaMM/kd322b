
public class Program {
	
	private String name;
	private String code;
	private int women;
	private int men;
	
	public Program(String name, String code, int women, int men){
		this.name = name;
		this.code = code;
		this.women = women;
		this.men = men;
	}
	
	@Override
	public String toString(){
		return name;
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
