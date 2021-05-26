public class ProgramLogger {
    private static ProgramLogger instance;
    public String value;

    private ProgramLogger(String value) {
        // Этот код эмулирует медленную инициализацию.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static ProgramLogger getInstance(String value) {
        if (instance == null) {
            instance = new ProgramLogger(value);
        }
        return instance;
    }
}
