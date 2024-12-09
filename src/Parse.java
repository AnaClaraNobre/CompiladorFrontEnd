import java.io.IOException;

public class Parse {
    public static void execute() throws IOException, InterruptedException {

        String[] lexerCommand = {"java", "-jar", "lib/jflex-full-1.9.1.jar", "-d", "src", "src/Lexer2.flex"};
        BuildUtils.runCommand(lexerCommand);

        String[] parserCommand = {"java", "-jar", "lib/java-cup-11b.jar", "-destdir", "src", "src/Parse.cup"};
        BuildUtils.runCommand(parserCommand);

        String[] compileCommands = {
            "javac", "-cp", "src;lib/java-cup-11b-runtime.jar", 
            "src/ParseTest.java", "src/scanner.java", "src/sym.java", "src/parser.java"
        };
        BuildUtils.runCommand(compileCommands);

        String[] runParseCommand = {
            "java", "-cp", "src;lib/java-cup-11b-runtime.jar;lib/jflex-full-1.9.1.jar", "ParseTest", "entrada.txt"
        };
        BuildUtils.runCommand(runParseCommand);

        System.out.println("Parse concluído!");
    }
}
