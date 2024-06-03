package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void handleArrayList1(ArrayList<String> tvShows) {
		
		tvShows.forEach(show -> System.out.println(show));
	}
	
	public static void handleArrayListIterator(ArrayList<String> tvShows) {
		
		Iterator<String> it = tvShows.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void handleArrayListForEach(ArrayList<String> tvShows) {
		
		for (String show : tvShows) {
			System.out.println(show);
		}
	}
	
	public static void handleArrayListForIndex(ArrayList<String> tvShows) {
		
		for(int i=0; i<tvShows.size(); i++) {
			System.out.println(tvShows.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Walking Dead");
		
		handleArrayList1(tvSeries);
		System.out.println("------------------------");
		handleArrayListIterator(tvSeries);
		System.out.println("------------------------");
		handleArrayListForEach(tvSeries);
		System.out.println("------------------------");
		handleArrayListForIndex(tvSeries);
	}

}
