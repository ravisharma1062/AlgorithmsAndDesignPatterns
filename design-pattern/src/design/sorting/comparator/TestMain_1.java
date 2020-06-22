package design.sorting.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import design.sorting.comparable.Movie;

public class TestMain_1 {

	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie(3, "Movie1", 2014));
		movieList.add(new Movie(4, "Movie2", 2019));
		movieList.add(new Movie(5, "Movie3", 2011));
		movieList.add(new Movie(4, "Movie4", 2000));
		movieList.add(new Movie(2, "Movie5", 2011));
		movieList.add(new Movie(1, "Movie6", 2014));
		
		Comparator<Movie> compRating = (Movie m1, Movie m2) -> {

			if(m1.getRating() == m2.getRating()) {
				return 0;
			} else if (m1.getRating() > m2.getRating()) {
				return 1;
			} else {
				return -1;
			}
		
		};
		
		Comparator<Movie> compRelease = (Movie m1, Movie m2) -> m1.getYear() - m2.getYear();
		
		//By Year
		//movieList.sort(compRelease);
		
		//By Year
		//movieList.sort(compRating);
		
		System.out.println(movieList);

	}

}
