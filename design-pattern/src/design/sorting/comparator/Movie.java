/**
 * 
 */
package design.sorting.comparator;

/**
 * Can be used for multiple sorting paramerets
 * 
 * @author ravisharma
 *
 */
public class Movie {

	private double rating; 
    private String name; 
    private int year;
    
	private Movie(double rating, String name, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}
	
}
