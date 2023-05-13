public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int was = 100;
        int replenishment = 1100;
        int bonusCoefficients = 100;
        int from = 1000;
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (replenishment > from) {
            int x = replenishment / bonusCoefficients + replenishment + was;
            System.out.println("Общая сумма - " + x + " рублей");
        } else {
            int x = replenishment + was;
            System.out.println("Общая сумма - " + x + " рублей");
        }
    }
}