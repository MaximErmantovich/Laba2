package Entity;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void requestService(Workshop workshop, IService service) {
        System.out.println(name + " запрашивает услугу: " + service.getName());
        workshop.checkServiceAvailability(this, service);
    }

    public void cancelService(Appointment appointment) {
        System.out.println(name + " отменяет запись на услугу: " + appointment.getService().getName());
        appointment.cancel();
    }
}