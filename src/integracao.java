import java.io.IOException;

public class integracao {
    public static void execute() throws IOException, InterruptedException {
        System.out.println("Executando Integração...");

        ScannerF.execute();

        Parse.execute();

        System.out.println("Integração concluída!");
    }
}
