import java.util.logging.Logger;

public class Tree {
    private int age;
    private double height;
    private String species;
    private String location;

    private static final Logger logger = Logger.getLogger(Tree.class.getName());

    //конструктор по умолчанию
    public Tree() {
        this.age = 0;
        this.height = 0.0;
        this.species = "Неизвестный вид";
        this.location = "Неизвестное местоположение";
        assert height >=0 : "Высота должна быть положительной"; // утверждение
        logger.info("Создано дерево с параметрами по умолчанию"); //логирование
    }

    //конструктор с параметрами
    public Tree(int age, double height, String species, String location) throws InvalidAgeEx, InvalidHeightEx {
        setAge(age);
        setHeight(height);
        this.species = species;
        this.location = location;
        logger.info("Создано дерево с параметрами: вид=" + species + ", возраст=" + age + ", высота=" + height + " м, местоположение=" + location);
    }

    //геттеры - методы доступа
    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getSpecies() {
        return species;
    }

    public String getLocation() {
        return location;
    }

    //сеттеры - методы модификации с проверкой параметров и исключениями
    public void setAge(int age) throws InvalidAgeEx {
        if (age < 0) {
            throw new InvalidAgeEx("Не может быть отрицательным");
        }
        this.age = age;
    }

    public void setHeight(double height) throws InvalidHeightEx {
        if (height < 0) {
            throw new InvalidHeightEx("Не может быть отрицательной");
        }
        this.height = height;
    }

    public void setSpecies(String species) {
        if (!species.trim().isEmpty()) {
            this.species = species;
        }
        else {
            System.out.println("Не может быть пустым");
        }
    }

    public void setLocation(String location) {
        if (!location.trim().isEmpty()) {
            this.location = location;
        }
        else {
            System.out.println("Не может быть пустым");
        }
    }

    //метод для вывода информации о дереве
    public void displayInfo(int index) {
        System.out.println("Дерево " + index);
        System.out.println("Вид: " + species + ", Возраст: " + age + " лет, Высота " + height + " м., Местоположение: " + location);
    }

    //дополнительный метод на основе известных значений
    public boolean isMature() {
        return this.age >=10;
    }
}
