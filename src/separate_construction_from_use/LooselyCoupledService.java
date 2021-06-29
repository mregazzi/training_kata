package separate_construction_from_use;

public class LooselyCoupledService {
    private LooselyCoupledService() {
    }

    public static LooselyCoupledService getInstance() {
        return new LooselyCoupledService();
    }

    public void doService() {
        System.out.println("Performing same service in a loosely copupled way.");
    }
}
