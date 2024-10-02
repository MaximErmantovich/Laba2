package Entity;


public class Mechanic implements IMechanic {//механик
    @Override
    public boolean checkAvailability(IService service) {
        return service.isAvailable();//типо проверить возможность этой услуги
    }
}
