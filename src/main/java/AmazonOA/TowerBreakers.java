package AmazonOA;

public class TowerBreakers {
    public static int towerBreakers(int n, int m) {
        // Write your code here
        if(n%2 == 0 || m == 1) {
            return 2;
        }
        return 1;
    }
}
