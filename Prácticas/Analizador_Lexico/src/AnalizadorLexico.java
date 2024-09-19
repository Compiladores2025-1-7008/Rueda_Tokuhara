import java.io.*;
import java.util.*;
import java.util.regex.*;

public class AnalizadorLexico {

    public static void main(String[] args) {
        try {
            // Leer el archivo de entrada
            BufferedReader br = new BufferedReader(new FileReader("prueba.txt"));
            StringBuilder inputBuilder = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                inputBuilder.append(linea).append("\n");
            }
            br.close();

            // Crear una instancia del analizador léxico
            AnalizadorLexico lexer = new AnalizadorLexico();
            List<Token> tokens = lexer.analizar(inputBuilder.toString());

            // Imprimir los tokens generados
            for (Token token : tokens) {
                System.out.println(token);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Expresiones regulares
    private static final String ID_REGEX = "[a-zA-Z]+";
    private static final String NUMERO_ENTERO_REGEX = "(0|[1-9][0-9]*)";
    private static final String NUMERO_DECIMAL_REGEX = "(0|[1-9][0-9]*)\\.[0-9]+";
    private static final String SPACE_REGEX = "[\\t\\n\\r\\v ]+";
    private static final String OP_SUMA_REGEX = "\\+";
    private static final String OP_ASIGNACION_REGEX = "::=|:=";

    // Método para analizar el texto y devolver una lista de tokens
    public List<Token> analizar(String input) {
        List<Token> tokens = new ArrayList<>();

        // Combinamos las expresiones regulares en el orden adecuado (entero antes que decimal)
        String combinedRegex = String.format("(%s)|(%s)|(%s)|(%s)|(%s)|(%s)",
                                             ID_REGEX, NUMERO_ENTERO_REGEX, NUMERO_DECIMAL_REGEX, SPACE_REGEX, OP_SUMA_REGEX, OP_ASIGNACION_REGEX);

        Pattern tokenPattern = Pattern.compile(combinedRegex);
        Matcher matcher = tokenPattern.matcher(input);

        // Procesamos las coincidencias de acuerdo a la posición de los grupos de captura
        while (matcher.find()) {
            if (matcher.group(1) != null) {  // Coincide con ID
                tokens.add(new Token(ClaseLexica.ID, matcher.group(1)));
            } else if (matcher.group(2) != null) {  // Coincide con NUMERO_ENTERO
                tokens.add(new Token(ClaseLexica.NUMERO_ENTERO, matcher.group(2)));
            } else if (matcher.group(3) != null) {  // Coincide con NUMERO_DECIMAL
                tokens.add(new Token(ClaseLexica.NUMERO_DECIMAL, matcher.group(3)));
            } else if (matcher.group(4) != null) {  // Coincide con SPACE
                tokens.add(new Token(ClaseLexica.SPACE, matcher.group(4)));
            } else if (matcher.group(5) != null) {  // Coincide con OP_SUMA
                tokens.add(new Token(ClaseLexica.OP_SUMA, matcher.group(5)));
            } else if (matcher.group(6) != null) {  // Coincide con OP_ASIGNACION
                tokens.add(new Token(ClaseLexica.OP_ASIGNACION, matcher.group(6)));
            }
        }

        return tokens;
    }
}
