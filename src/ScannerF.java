import java.io.IOException;

public class ScannerF {
    public static void execute() throws IOException, InterruptedException {
        String[] lexerCommand = {"java", "-jar", "lib/jflex-full-1.9.1.jar", "-d", "src", "src/Lexer.flex"};
        BuildUtils.runCommand(lexerCommand);

        String[] compileScannerCommand = {"javac", "-cp", "src", "src/scanner.java"};
        BuildUtils.runCommand(compileScannerCommand);

        String[] runScannerCommand = {"java", "-cp", "src", "scanner", "entrada.txt"};
        BuildUtils.runCommand(runScannerCommand);

        System.out.println("Analisador léxico concluído!");
    }
}
