import java.util.Scanner;
public class menu {
    public static int menu() {
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите действие");
        System.out.println("--------------------------------");
        System.out.println("1 - Добавить пустое дерево");
        System.out.println("2 - Добавить дерево с данными");
        System.out.println("3 - Редактировать");
        System.out.println("4 - Вывести информацию о деревьях");
        System.out.println("5 - Отсортировать деревья по возрасту");
        System.out.println("6 - Выйти");
        System.out.println("Выберите нужный пункт: ");

        selection = input.nextInt();
        return selection;

    }
}
