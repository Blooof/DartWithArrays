package ru.ifmo.larionov.dart;

/**
 * @author Oleg Larionov
 */
public class JarMain {
    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }
        String fileName = args[0];
        Main.run(fileName);
    }

    private static void printUsage() {
        System.out.println("Usage: java -jar DartTranslator.jar fileName.dart.\nDartTranslator will create Main.class.\n Just run it with java Main");
    }
}
