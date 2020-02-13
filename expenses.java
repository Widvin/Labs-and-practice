package by.gsu.pms;

public class expenses {
    int Rate = 25000;
    String Account;
    float Expenses;
    int NumberOfDays;


    public static class TripExpenses(String _account, float _expenses, int _numberOfDays){
        Account = _account;
        Expenses = _expenses;
        NumberOfDays = _numberOfDays;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String acc) {
        Account = acc;
    }

    public float getExpenses() {
        return Expenses;
    }

    public void setExpenses(float exp) {
        Expenses = exp;
    }

    public int getNumberOfDays() {
        return NumberOfDays;
    }

    public void setNumberOfDays(int days) {
        NumberOfDays = days;
    }

        public float get_total() {
            if (NumberOfDays == 1) {
                return Expenses;
            } else {
                return Rate * NumberOfDays;
            }
        }
    }