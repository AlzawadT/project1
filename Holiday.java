public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public boolean inSameMonth(Holiday holiday){
        if(this.month == holiday.month)
            return true;
        else
            return false;
    }

    public double aveDate(Holiday [] holiday){
        double sum = 0;

        for (int i = 0; i < holiday.length; i++){
            sum+= holiday[i].day;
        }

        return sum/holiday.length;
    }

}
