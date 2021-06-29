package separate_construction_from_use;

public class SeparateConstructionFromUseExample {
    public static void main(String[] args) {
        TightlyCoupledService myTightlyCoupledService = new TightlyCoupledService();
        myTightlyCoupledService.doService();

        LooselyCoupledService myLooselyCoupledService = LooselyCoupledService.getInstance();
        myLooselyCoupledService.doService();

        BusinessObject bObject = BusinessObject.getInstance(InjectedService.getInstance());
        bObject.performBusinessLogic();
    }
}
