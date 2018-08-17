public class Main {

    public static void main(String[] args) {
	// write your code here
        Natwest nw1 = new Natwest("nw001");

        Natwest nw2 = new Natwest("nw002");

        System.out.println(Natwest.netprofit);

        nw1.updateProfit(23);
        System.out.println(Natwest.netprofit);

        nw2.updateProfit(50);
        System.out.println(Natwest.netprofit);

        System.out.println(closest(10,7,9));

        for (int i = 0; i < 100; i++) {
            if(primenumber(i)){
                System.out.println(i);
            }
        }
    }

    public static int closest(int target, int a, int b){
        if (target - a> target -b)return b;
        else return a;
    }

    public static boolean primenumber (int x) {
        for (int i = 2; i < x; i++) {

            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}
