package observer;

public class Main {
    public static void main(String[] args) {
        // Создаём экземпляры Observable и Observers
        Magazine magazine = new Magazine();
        MagazineSubscriber observer1 = new MagazineSubscriber();
        MagazineSubscriber observer2 = new MagazineSubscriber();

        // Добавляем наблюдателей субъекту
        magazine.attach(observer1);
        magazine.attach(observer2);

        // Задаём номер журнала
        magazine.setNumber(1);
        System.out.println("Observer 1 Magazine number " + observer1.getMagazineNumber());
        System.out.println("Observer 2 Magazine number " + observer2.getMagazineNumber());

        // изменяем номер журнала
        magazine.setNumber(2);
        System.out.println("Observer 1 Magazine number " + observer1.getMagazineNumber());
        System.out.println("Observer 2 Magazine number " + observer2.getMagazineNumber());
    }
}
