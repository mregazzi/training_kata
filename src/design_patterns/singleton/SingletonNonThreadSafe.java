package design_patterns.singleton;

public final class SingletonNonThreadSafe {
    private static SingletonNonThreadSafe instance;
    public String value;

    private SingletonNonThreadSafe(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonNonThreadSafe getInstance(String value) {
        if (instance == null) {
            instance = new SingletonNonThreadSafe(value);
        }
        return instance;
    }
}
