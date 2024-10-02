import Entity.*;
public class Main {
    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();
        Workshop workshop = new Workshop(mechanic);

        // Создание услуг с ценами
        Service oilChange = new Service("Замена масла", true, 1500);
        Service tireChange = new Service("Смена шин", false, 2000); // Недоступная услуга
        Service brakeCheck = new Service("Проверка тормозов", true, 1000);

        // Добавление услуг в мастерскую
        workshop.addService(oilChange);
        workshop.addService(tireChange);
        workshop.addService(brakeCheck);

        // Создание клиента
        Client client = new Client("Алексей");

        // Примеры использования
        client.requestService(workshop, oilChange);
        client.requestService(workshop, tireChange); // должно показать, что услуга недоступна
        client.requestService(workshop, brakeCheck);
    }
}
