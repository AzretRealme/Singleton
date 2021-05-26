public class Main {
    public static void main(String[] args) {


        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        ProgramLogger singleton = ProgramLogger.getInstance("FOO");
        ProgramLogger anotherSingleton = ProgramLogger.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}