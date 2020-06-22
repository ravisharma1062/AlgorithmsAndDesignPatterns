package design.sorting.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import design.sorting.comparable.Movie;

public class TestMain_2 {

	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie(3, "Movie1", 2014));
		movieList.add(new Movie(4, "Movie2", 2019));
		movieList.add(new Movie(5, "Movie3", 2011));
		movieList.add(new Movie(4, "Movie4", 2000));
		movieList.add(new Movie(2, "Movie5", 2011));
		movieList.add(new Movie(1, "Movie6", 2014));
		
		Comparator<Movie> ratingComparator = Comparator.comparing(Movie::getRating);
		
		Comparator<Movie> yearComparator = Comparator.comparing(Movie::getYear).reversed();
		
		Comparator<Movie> ratingAndYear = ratingComparator.thenComparing(yearComparator);
		
		movieList = movieList.stream().sorted(ratingAndYear).collect(Collectors.toList());
		
		System.out.println(movieList);

	}

}
