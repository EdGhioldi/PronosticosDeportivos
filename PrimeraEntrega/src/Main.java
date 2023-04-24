    import java.io.IOException;
    import java.nio.file.*;
    import java.util.*;

    public class Main {

        public static void main(String[] args) {

            Path resultadosPath = Paths.get("src/resultados.csv");
            Path pronosticoPath = Paths.get("src/pronostico.csv");

            String resultadosContenido = readFileAsString(resultadosPath);
            String pronosticoContenido = readFileAsString(pronosticoPath);

            String[] resultadosLineas = resultadosContenido.split("\n");
            String[] pronosticoLineas = pronosticoContenido.split("\n");

            // iterar sobre las líneas de los archivos aquí...

            for (String linea : resultadosLineas) {
                System.out.println("Línea de resultados: " + linea);
            }

            for (String linea : pronosticoLineas) {
                System.out.println("Línea de pronósticos: " + linea);
            }

        }

        public static String readFileAsString(Path filePath) {
            try {
                byte[] bytes = Files.readAllBytes(filePath);
                return new String(bytes);
            } catch (IOException e) {
                System.out.println("Error al leer el archivo " + filePath.toString() + ": " + e.getMessage());
                return null;
            }
        }


    }
