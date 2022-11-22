public class Main {
    public static void main(String[] args) {

        Holiday holiday = new Holiday("Independence Day", 4, "July");
        System.out.println(holiday.getName() + " " + holiday.getMonth());

        Movie movie = new Movie("Casino Royale", "Eon Productions", "PG-13");
        System.out.println(movie.getTitle());
    }
}