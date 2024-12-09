import java.io.*;

public class ParseTest {
    public static void main(String[] args) {
        try {
            scanner scanner = new scanner(new FileReader("entrada.txt"));
            parser parser = new parser(scanner);
            System.out.println("Iniciando análise sintática...");
            parser.parse(); 
            System.out.println("Análise sintática concluída com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro durante a análise sintática: " + e.getMessage());
        }
    }
}
