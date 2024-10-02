package Entity;

import java.util.ArrayList;
import java.util.List;

// Класс для мастерской
public class Workshop {
    private IMechanic mechanic;
    private List<IService> services;

    public Workshop(IMechanic mechanic) {
        this.mechanic = mechanic;
        this.services = new ArrayList<>();
    }

    public void addService(IService service) {
        services.add(service);
    }

    public void checkServiceAvailability(Client client, IService service) {
        if (mechanic.checkAvailability(service)) {
            Appointment appointment = new Appointment(client, service);
            appointment.confirm();
            processPayment(service);
        } else {
            System.out.println("Услуга " + service.getName() + " недоступна в данное время.");
        }
    }

    private void processPayment(IService service) {
        Payment payment = new Payment(service.getPrice());
        payment.processPayment();
    }
}
