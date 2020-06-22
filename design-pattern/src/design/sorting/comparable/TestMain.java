package design.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie(3, "Movie1", 2014));
		movieList.add(new Movie(4, "Movie2", 2019));
		movieList.add(new Movie(5, "Movie3", 2011));
		movieList.add(new Movie(4, "Movie4", 2000));
		movieList.add(new Movie(2, "Movie5", 2011));
		movieList.add(new Movie(1, "Movie6", 2014));
		
		Collections.sort(movieList);
		
		System.out.println(movieList);
	}

}
