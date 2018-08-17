public class Bank {
    int x;
    static int dollar;
    public void setDollar(int A) {
        dollar = A;
    }

    public void amount (int A) {
        System.out.println(A * dollar);
    }

    public void what(){
        System.out.print(x);

    }
}
