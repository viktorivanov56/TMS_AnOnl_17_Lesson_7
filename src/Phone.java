public class Phone {
    //Создайте класс Phone, который содержит переменные number, model и
    //weight.
    //Создайте три экземпляра этого класса.
    //Выведите на консоль значения их переменных.
    //Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
    //звонящего.
    // Выводит на консоль сообщение “Звонит {name}”. getNumber –
    //возвращает номер телефона.
    // Вызвать эти методы для каждого из объектов.
    //Добавить конструктор в класс Phone, который принимает на вход три
    //параметра для инициализации переменных класса - number, model и
    //weight.
    //Добавить конструктор, который принимает на вход два параметра для
    //инициализации переменных класса - number, model.
    //Добавить конструктор без параметров.
    //Вызвать из конструктора с тремя параметрами конструктор с двумя.
    //Добавьте перегруженный метод receiveCall, который принимает два
    //параметра - имя звонящего и номер телефона звонящего.
    // Вызвать этот метод.
    //Создать метод sendMessage с аргументами переменной длины.
    // Данный метод принимает на вход номера телефонов, которым будет отправлено
    //сообщение.
    // Метод выводит на консоль номера этих телефонов
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
       // Вызов конструктора с тремя параметрами
        this(number, model, 0.0);
    }

    // Конструктор без параметров
    public Phone() {
        this("", "", 0.0);
    }

    // Метод receiveCall с одним параметром
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Перегруженный метод receiveCall с двумя параметрами
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " с номера " + callerNumber);
    }

    // Метод getNumber
    public String getNumber() {
        return number;
    }

    // Метод sendMessage с переменным числом аргументов
    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправлено сообщение на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    // Пример использования класса
    public static void main(String[] args) {
        // Создаем три экземпляра класса Phone
        Phone phone1 = new Phone("+7-923-456-73-89", "Samsung", 200);
        Phone phone2 = new Phone("+7-988-654-36-21", "Nokia");
        Phone phone3 = new Phone();

        // Выводим значения переменных
        System.out.println("Phone 1: Number - " + phone1.getNumber() + ", Model - " + phone1.model + ", Weight - " + phone1.weight);
        System.out.println("Phone 2: Number - " + phone2.getNumber() + ", Model - " + phone2.model + ", Weight - " + phone2.weight);
        System.out.println("Phone 3: Number - " + phone3.getNumber() + ", Model - " + phone3.model + ", Weight - " + phone3.weight);

        // Вызываем метод receiveCall для каждого объекта
        phone1.receiveCall("Виктор");
        phone2.receiveCall("Татьяна");
        phone3.receiveCall("Саша");

        // Вызываем перегруженный метод receiveCall
        phone1.receiveCall("Миша", "+7-932-342-67-34");

        // Вызываем метод sendMessage
        phone1.sendMessage("+7-153-892-35-77", "+7-323-284-56-66");
    }
}