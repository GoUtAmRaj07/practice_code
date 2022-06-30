public class infectedHouses {
    public static void main(String[] args) {
        int[] infectedHouses = { 1, 4, 9 };
        int n = 10;
        dayWisehouseInfected(n, infectedHouses);
    }

    private static void dayWisehouseInfected(int n, int[] infectedHouses) {
        boolean[] isInfected = new boolean[n];
        int infectedCount = 0;
        for (int i = 0; i < isInfected.length; i++) {
            isInfected[infectedHouses[i]] = true;
            infectedCount++;
        }

        while (infectedCount != n) {

        }

    }
}
