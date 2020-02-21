package by.gsu.pms;


public class Stock {
    private String name;
    private int count;
    private boolean availability;

    public Stock(String name, int count, boolean availability) {
        this.count = count;
        this.name = name;
        this.availability = availability;
    }

      public String getname() {
        return name;
    }


    public int getcount() {
        return count;
    }

    public boolean availability() {
        return availability;
    }
}
