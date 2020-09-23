package comp2522.code.week2;

/**
 * Ensures only one class instance is instantiated.
 */
public class PrivateConstructor {
    private static PrivateConstructor singleInstance = null;

    private PrivateConstructor() { /* Does nothing! */}

    /**
     * Returns an instance of a PrivateConstructor class. This is a STATIC FACTORY METHOD.
     *
     * @return PrivateConstructor class
     */
    public static PrivateConstructor getInstance() {
        if (singleInstance == null) {
            singleInstance = new PrivateConstructor();
        }
        return singleInstance;
    }
}
