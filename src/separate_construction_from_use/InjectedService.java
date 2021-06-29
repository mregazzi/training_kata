package separate_construction_from_use;

public class InjectedService {
    private InjectedService() {
    }

    public static InjectedService getInstance() {
        return new InjectedService();
    }

    public void doService() {
        System.out.println("Performing same service in a injected way.");
    }
}
