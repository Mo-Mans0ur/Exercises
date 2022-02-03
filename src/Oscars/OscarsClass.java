package Oscars;

public class OscarsClass {
    private int year;
    private int lenght;
    private String title;
    private String subject;
    private int popularity;
    private boolean awards;

    public OscarsClass(int year, int lenght, String title, String subject, int popularity, boolean awards) {
        this.year = year;
        this.lenght = lenght;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public boolean isAwards() {
        return awards;
    }

    public void setAwards(boolean awards) {
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "Oscars nominee {" +
                "year=" + year +
                ", lenght=" + lenght +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", popularity=" + popularity +
                ", awards=" + awards +
                '}';
    }
}
