package separate_construction_from_use;

public class BusinessObject {
    private final InjectedService service;

    private BusinessObject(InjectedService service) {
        this.service = service;
    }
    public static BusinessObject getInstance(InjectedService service) {
        return new BusinessObject(service);
    }

    public void performBusinessLogic() {
        service.doService();
    }
}
