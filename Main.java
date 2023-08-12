import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Raffle r = new Raffle();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Меню:
                    1 - Добавить новую игрушку
                    2 - Изменить частоту выпадения какой-нибудь игрушки
                    3 - Провести розыгрыш и сохранить результаты
                    0 - Выход
                    >\s""");
            var selection = sc.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println("Пока!");
                    System.exit(0);
                }
                default -> System.out.println("Неправильно введены данные. Попробуйте еще раз.");
            }
        }
    }
}