import by.gsu.pms.Stock;

public class Runner<i, cost> {
    public Runner(){
        Stock[] stocks = new Stock[10];
        stocks[0] = new Stock("chair", 15, true);
        stocks[1] = new Stock("bed", 40, false);
        stocks[2] = new Stock("closet", 73, true);
        stocks[3] = new Stock("sofa", 59, true);
        stocks[4] = new Stock("table", 38, false);
        stocks[5] = new Stock("mirror", 12, false);
        stocks[6] = new Stock("armchair", 165, true);
        stocks[7] = new Stock("sideboard", 97, true);
        stocks[8] = new Stock("dressing table", 91, false);
        stocks[9] = new Stock("bedside table", 60, true);
    }

        int totalcost = 0;
        for(int i = 0; i < stocks.length; i++){
             totalcost = stocks[i].getCost() + totalcost;
         }

        System.out.println("Total cost: " + cost);

        int Availability = 0;
        for(int i = 0; i < races.length; i++){
        if(stocks[i].isAvailability() == true){
            ++Availability;
        }
        }
         System.out.println("Number of products in stock: " + Availability);
    }








