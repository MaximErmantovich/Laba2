package Entity;

class Appointment {
    private Client client;
    private IService service;
    private boolean isConfirmed;

    public Appointment(Client client, IService service) {
        this.client = client;
        this.service = service;
        this.isConfirmed = false;
    }

    public void confirm() {
        isConfirmed = true;
        System.out.println("Запись на услугу " + service.getName() + " подтверждена для клиента " + client.getName());
    }

    public void cancel() {
        System.out.println("Запись на услугу " + service.getName() + " отменена для клиента " + client.getName());
    }

    public IService getService() {
        return service;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }
}
