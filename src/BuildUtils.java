import java.io.IOException;

public class BuildUtils {
    public static void runCommand(String[] command) throws IOException, InterruptedException {
        ProcessBuilder builder = new ProcessBuilder(command);
        builder.redirectErrorStream(true);
        builder.inheritIO();
        Process process = builder.start();
        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new RuntimeException("Erro ao executar o comando: " + String.join(" ", command));
        }
    }
}
