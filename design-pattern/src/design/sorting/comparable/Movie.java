package design.sorting.comparable;
/**
 * Comparison on single field
 * 
 * @author ravisharma
 *
 */
public class Movie implements Comparable<Movie> {
	
	private double rating; 
    private String name; 
    private int year; 

	public Movie(double rating, String name, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	@Override
	public int compareTo(Movie movie) {
		if(this.rating == movie.rating) {
			return 0;
		} else if (this.rating > movie.rating) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}

}
