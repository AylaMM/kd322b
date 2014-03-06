import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;


public class BikeStore {
	private ArrayList<Bike> bikes;

	public BikeStore() {
		this.bikes = new ArrayList<Bike>();
	}

	
	public String getAllBikes() {
		String allBikes = "";
		for(int i = 0; i < bikes.size(); i++){
			allBikes += getBikeInfo(i);
		}
		return allBikes;
	}
	
	private String getBikeInfo(int i) {
		return " Färg:  " + bikes.get(i).getColor() + ".    Storlek:  " + bikes.get(i).getSize() + " tum.    Pris:  " + bikes.get(i).getPrice() + " kr. \n"; //Ändra för att ändra på utskriften.
	}
	
	public String addBike(String color, String size, String price){
		int bikeSize;
		int bikePrice;
		try {
			bikeSize = Integer.parseInt(size);
			bikePrice = Integer.parseInt(price);
		} catch (NumberFormatException e) {
			return "Invalid bike";
		}
		boolean priceOk = Constants.checkPrice(bikePrice);
		boolean sizeOk = Constants.checkSize(bikeSize);
		boolean colorOk = Constants.checkColor(color);
		if(priceOk && sizeOk && colorOk) {
			Bike bike = new Bike(color, bikeSize, bikePrice);
			bikes.add(bike);
			return getBikeInfo(bikes.size() - 1);
		} else {
			return "Invalid bike";
		}
	}

}
