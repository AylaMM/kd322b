import java.awt.Color;

/*
 * ----------------------------------- 
 * Bike 
 * ----------------------------------- 
 * - color:String 
 * - price:int 
 * - size:int
 *  - nbrOfBikes:int  //Counts nbr of instances 
 *  ----------------------------------- 
 *  + Bike(color:String, size:int) 
 *  + Bike(color:String,size:int,price:int) 
 *  ----------------------------------- 
 *  + getColor():String 
 *  + getSize():int 
 *  + getPrice():int 
 *  + setPrice(price:int) 
 *  +getNumberOfBikes():int 
 *  -----------------------------------
 * */

public class Bike {
	private String color;
	private int price;
	private int size;
	private int nbrOfBikes; 

	public Bike(String color, int size){
		this.color = color;
		this.size = size;
		nbrOfBikes++;
	}
	
	public Bike(String color, int size, int price){
		this.color = color;
		this.size = size;
		this.price = price;
		nbrOfBikes++;
	}

	public String getColor(){
		return this.color;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumberOfBikes(){
		return nbrOfBikes;
	}

}
