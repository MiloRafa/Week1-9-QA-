public class Natwest {
    static int netprofit;
    String branchname;

    public Natwest(String name) {
        branchname = name;
    }

    public void updateProfit(int x){
        netprofit += x; // taking netprofit and adding x to it and then adding it again to netprofit


    }
}
