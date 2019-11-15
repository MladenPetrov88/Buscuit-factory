import java.util.Scanner;

public class BuscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double buscuitsPerDayForWorker = Integer.parseInt(scanner.nextLine());
        double workersCount = Integer.parseInt(scanner.nextLine());
        double competingCompany = Integer.parseInt(scanner.nextLine());

        double totalBuscuits = 0;
        double diff = 0;

        for (int i = 1; i <= 30 ; i++) {
            if (i % 3 == 0) {
                totalBuscuits += Math.floor(buscuitsPerDayForWorker * workersCount * 0.75);
            } else {
                diff += buscuitsPerDayForWorker * workersCount;
            }
        }

        double allBis = totalBuscuits + diff;

        System.out.printf("You have produced %.0f biscuits for the past month.%n", allBis);
        double diffComp = allBis - competingCompany;

        if (allBis > competingCompany) {
            System.out.printf("You produce %.2f percent more biscuits.", diffComp / competingCompany * 100);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.", Math.abs(diffComp / competingCompany * 100));
        }


    }
}
