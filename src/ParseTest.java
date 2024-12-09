import java.io.*;

import java_cup.parser;

public class ParseTest {
    public static void main(String[] args) {
        try {
            scanner scanner = new scanner(new FileReader("entrada.txt"));
            parser parser = new parser(scanner);
            System.out.println("Iniciando análise sintática...");
            parser.parse(); // Executa o parser com base no scanner fornecido
            System.out.println("Análise sintática concluída com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro durante a análise sintática: " + e.getMessage());
        }
    }
}
