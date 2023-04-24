import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //CREAMOS UN OBJETO PATH CON LA RUTA RELATIVA DE LOS ARCHIVOS.
        Path resultadosPath = Paths.get("src/resultados.csv");
        Path pronosticoPath = Paths.get("src/pronostico.csv");

        //ALMACENAMOS ESTE PATH EN UNA VARIABLE DE TIPO STRING
        String resultadosContenido = readFileAsString(resultadosPath);
        String pronosticoContenido = readFileAsString(pronosticoPath);

        //A LA VARIABLE ANTERIOR LA DIVIDIMOS EN ARRAYS POR LOS SALTOS DE PAGINA, TODO EN VARIABLE STRING
        String[] resultadosFilas = resultadosContenido.split("\n");
        String[] pronosticoFilas = pronosticoContenido.split("\n");

        //DIVIDIMOS LOS NUEVOS STRING EN, NUEVAMENTE, STRING, PERO AHORA SEPARADOS POR LA ",".
        //EXCEPTO LA 1er LINEA, QUE ES ENUNCIATIVA
        String[] resultadosLinea1 = resultadosFilas[1].split(",");
        String[] resultadosLinea2 = resultadosFilas[2].split(",");
        String[] pronosticoLinea1 = pronosticoFilas[1].split(",");
        String[] pronosticoLinea2 = pronosticoFilas[2].split(",");

        /* HASTA AQUÍ, PUDIMOS INDIVIDUALIZAR LOS VALORES DE LOS ARCHIVOS '.CSV'.
        EN "RESULTADOS", SABEMOS POR LA FORMA EN QUE ESTÁ DIESPUESTO EL ARCHIVO '.CSV' QUE
        EL PRIMER Y EL ÚLTIMO PARAMETRO SON NOMBRES DE LOS EQUIPOS, Y QUE LOS PARAMETROS
        2DO Y 3RO SON LA CANTIDAD DE GOLES HECHOS POR CADA UNO. POR LO QUE [0,3] SON DE TIPO
        STRING Y [1,2] SON DE TIPO INT.   */

        //AHORA PASAREMOS LOS GOLES A PARAMETROS DE TIPO NUMERICO
        int golesResultadoLinea1Eq1 = Integer.parseInt(resultadosLinea1[1]);
        int golesResultadoLinea1Eq2 = Integer.parseInt(resultadosLinea1[2]);
        int golesResultadoLinea2Eq1 = Integer.parseInt(resultadosLinea2[1]);
        int golesResultadoLinea2Eq2 = Integer.parseInt(resultadosLinea2[2]);

        //EN CUANTO A RESULTADO, YA TENEMOS EN VARIABLES INDIVIDUALES Y DE TIPO CORRECTO LOS VALORES.

        //AHORA SEPARAREMOS DE PRONOSTICO, LOS EQUIPOS DE LA ELECCION
        String equipo1Pronostico1 = pronosticoLinea1[0];
        String equipo2Pronostico1 = pronosticoLinea1[4];
        String equipo1Pronostico2 = pronosticoLinea2[0];
        String equipo2Pronostico2 = pronosticoLinea2[4];

        // TOMAMOS LOS VALORES DE LAS ELECCIONES EN UN NUEVO ARREGLO, NO ES NECESARIO CAMBIARLE EL TIPO
        String[] pronosticoPartido1 = {pronosticoLinea1[1],pronosticoLinea1[2],pronosticoLinea1[3]};
        String[] pronosticoPartido2 = {pronosticoLinea2[1],pronosticoLinea2[2],pronosticoLinea2[3]};

        //CREAMOS UNA FUNCION 'calcularPronostico' QUE DEVUELVA EL RESULTADO DEL PRONOSTICO
        String resultadoPronostico1 = calcularPronostico(pronosticoPartido1);//GANA EQUIPO1
        String resultadoPronostico2 = calcularPronostico(pronosticoPartido2);// EMPATE


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
    public static String calcularPronostico(String[] pronosticoPartido) {
        if (pronosticoPartido[0].equals("x")) {
            return "GANA EQUIPO1";
        } else if (pronosticoPartido[1].equals("x")) {
            return "EMPATE";
        } else{
            return "GANA EQUIPO2";
        }
    }



}