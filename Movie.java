public class Movie {
    private String title;
    private String studio;
    private String rating;


    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getTitle() {
        return title;
    }

    public Movie[] getPG(Movie[] movie) {
        Movie[] pgMovie = new Movie[movie.length];
        int index = 0;
        for (int i = 0; i < movie.length; i++) {
            if (movie[i].rating == ("PG")) {
                pgMovie[index] = movie[i];
                index++;
            }
        }
        return pgMovie;
    }
}