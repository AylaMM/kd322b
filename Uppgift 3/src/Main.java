import java.awt.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args){

//		ArrayList<Bike> bikeList = new ArrayList<Bike>();
//
//		bikeList.add(new Bike("red", 20, 111));
//		bikeList.add(new Bike("blue", 21, 222));
//		bikeList.add(new Bike("green", 22, 333));
//		bikeList.add(new Bike("purple", 23, 444));
//		bikeList.add(new Bike("yellow", 24, 555));
//		bikeList.add(new Bike("orange", 25, 666));
//		bikeList.add(new Bike("turquoise", 26, 777));
//		bikeList.add(new Bike("white", 27, 888));
//		bikeList.add(new Bike("black", 28, 999));
//		bikeList.add(new Bike("poopfärg", 29, 9001));
//
//		for(int i = 0; i < bikeList.size(); i++){
//			String bikeInfo = new String("Bike" + i + ": color - " + bikeList.get(i).getColor() + ", size - " + bikeList.get(i).getSize() + ", price - " + bikeList.get(i).getPrice() + ".");
//			System.out.println(bikeInfo);
//		}

	    BikeStore bikeStore = new BikeStore();
	    bikeStore.addBike("red", "20", "111");
	    bikeStore.addBike("blue", "21", "222");
	    bikeStore.addBike("poopfärg", "23", "333");
	    System.out.println("Bikes: \n" + bikeStore.getAllBikes());
	    
	}

}