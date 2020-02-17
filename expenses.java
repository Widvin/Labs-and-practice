package by.gsu.pms;

public class expenses {
    private int Rate = 25000;
    String Account;
    float Expenses;
    int NumberOfDays;


    public static class TripExpenses(String _account, float _expenses, int _numberOfDays){
        this.Account = _account;
        this.Expenses = _expenses;
        this.NumberOfDays = _numberOfDays;
    }
    public Cheque() {
        this.Account = "Name";
        this.Expenses = 0;
        this.NumberOfDays = 1;
    }

    public String getAccount() {

        return Account;
    }

    public void setAccount(String acc) {

        Account = acc;
    }

    public float getExpenses()
    {
        return Expenses;
    }

    public void setExpenses(float exp)
    {
        this.Expenses = exp;
    }

    public int getNumberOfDays()
    {
        return NumberOfDays;
    }

    public void setNumberOfDays(int days) {

        this.NumberOfDays = days;
    }

        public float get_total() {
            if (NumberOfDays == 1) {
                return Expenses;
            } else {
                return Rate * NumberOfDays;
            }
        }

    public void show(){
        System.out.println(" - - - - - - - ");
        System.out.println("Командировочные выплаты = " + Rate);
        System.out.println("Чек = " + Account);
        System.out.println("Расход на транспорт = " + Expenses);
        System.out.println("Число дней = " + NumberOfDays);
        System.out.println("Сумма = " + get_total());
    }

    public String to_string(){
        return Rate +";"+ Account+";"+ Expenses";"+NumberOfDays+";"+get_total();
    }
}



    }