public class Main {
    public static void main(String[] args) {
        //task 1.1
        int i = 1;
        int total = 0;
        while (total < 10) {
            total = total + i;
            System.out.println(total);
        }
        // task 1.2
        for (int l = 10; l > 0; l--)
            System.out.println(l);

        //task 2
        for (int t = 2; t <= 31; t = t + 7)
            System.out.println("Сегодня " + t + " число. Необходимо подготовить отчет.");

        //task 3
        for (int j = (2022 - 200); j > (2022 + 100); j = j + 79)
            System.out.println("Годы появления кометы " + j);
    }
}