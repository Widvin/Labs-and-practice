package by.gsu.pms;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
       public class Sort {

        public static Stock[] get_sorted_stock_by_values(Stock[] array){
            Arrays.sort(array, Comparator.comparing(Stock::getcost));
            return array;
        }

        public static Stock[] get_sorted_Stocks_by_names(Stock[] array){
            Arrays.sort(array, Comparator.comparing(Stock::getName));
            return array;
        }
    }

}
