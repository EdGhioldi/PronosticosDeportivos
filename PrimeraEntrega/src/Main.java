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

        /*
        System.out.println("1er Fila de Resultados.csv es: " + resultadosFilas[0]);
        System.out.println("2da Fila de Resultados.csv es: " + resultadosFilas[1]);
        System.out.println("3er Fila de Resultados.csv es: " + resultadosFilas[2]);
        System.out.println("1er Fila de Pronostico.csv es: " + pronosticoFilas[0]);
        System.out.println("2da Fila de Pronostico.csv es: " + pronosticoFilas[1]);
        System.out.println("3er Fila de Pronostico.csv es: " + pronosticoFilas[2]);
        */

        //DIVIDIMOS LOS NUEVOS STRING EN, NUEVAMENTE, STRING, PERO AHORA SEPARADOS POR LA ",".
        //EXCEPTO LA 1er LINEA, QUE ES ENUNCIATIVA
        String[] resultadosLinea1 = resultadosFilas[1].split(",");
        String[] resultadosLinea2 = resultadosFilas[2].split(",");
        String[] pronosticoLinea1 = pronosticoFilas[1].split(",");
        String[] pronosticoLinea2 = pronosticoFilas[2].split(",");
        /* PRUEBA
        System.out.println("1er elemento del arreglo es: " + resultadosLinea1[0]);
        System.out.println("2do elemento del arreglo es: " + resultadosLinea1[1]);
        System.out.println("3er elemento del arreglo es: " + resultadosLinea1[2]);
        System.out.println("4to elemento del arreglo es: " + resultadosLinea1[3]);
        System.out.println("1er elemento del arreglo es: " + resultadosLinea2[0]);
        System.out.println("2do elemento del arreglo es: " + resultadosLinea2[1]);
        System.out.println("3er elemento del arreglo es: " + resultadosLinea2[2]);
        System.out.println("4to elemento del arreglo es: " + resultadosLinea2[3]);

        System.out.println("1er elemento del arreglo es: " + pronosticoLinea1[0]);
        System.out.println("2do elemento del arreglo es: " + pronosticoLinea1[1]);
        System.out.println("3er elemento del arreglo es: " + pronosticoLinea1[2]);
        System.out.println("4to elemento del arreglo es: " + pronosticoLinea1[3]);
        System.out.println("4to elemento del arreglo es: " + pronosticoLinea1[4]);
        System.out.println("1er elemento del arreglo es: " + pronosticoLinea1[0]);
        System.out.println("2do elemento del arreglo es: " + pronosticoLinea2[1]);
        System.out.println("3er elemento del arreglo es: " + pronosticoLinea2[2]);
        System.out.println("4to elemento del arreglo es: " + pronosticoLinea2[3]);
        System.out.println("4to elemento del arreglo es: " + pronosticoLinea2[4]);
        */

        /* HASTA AQUÍ, PUDIMOS INDIVIDUALIZAR LOS VALORES DE LOS ARCHIVOS '.CSV'.  EN "RESULTADOS", SABEMOS POR
        LA FORMA EN QUE ESTÁ DIESPUESTO EL ARCHIVO '.CSV' QUE EL PRIMER Y EL ÚLTIMO PARAMETRO SON NOMBRES DE
        LOS EQUIPOS, Y QUE LOS PARAMETROS 2 Y 3 SON LA CANTIDAD DE GOLES HECHOS POR CADA UNO. POR LO QUE [0,3]
        DEBEN SER DE TIPO STRING Y [1,2] DEBEN SER DE TIPO INT.   */

        //AHORA PASAREMOS LOS GOLES A PARAMETROS DE TIPO NUMERICO
        int golesLinea1Eq1 = Integer.parseInt(resultadosLinea1[1]);
        int golesLinea1Eq2 = Integer.parseInt(resultadosLinea1[2]);
        int golesLinea2Eq1 = Integer.parseInt(resultadosLinea2[1]);
        int golesLinea2Eq2 = Integer.parseInt(resultadosLinea2[2]);
        /* PRUEBA
        System.out.println("Goles de Argentina: " + golesLinea1Eq1);
        System.out.println("Goles del Arabia Saudita: " + golesLinea1Eq2);
        System.out.println("Goles del Polonia: " + golesLinea2Eq1);
        System.out.println("Goles del Mexico: " + golesLinea2Eq2);
        */

        //EN CUANTO A RESULTADO, YA TENEMOS EN VARIABLES INDIVIDUALES Y DE TIPO CORRECTO LOS VALORES.
        String eq1Linea1 = resultadosLinea1[0];
        String eq2Linea1 = resultadosLinea1[3];
        String eq1Linea2 = resultadosLinea2[0];
        String eq2Linea2 = resultadosLinea2[3];
        /* PRUEBA
        System.out.println("Equipo 1 : " + eq1Linea1);
        System.out.println("Equipo 2 : " + eq2Linea1);
        System.out.println("Equipo 3 : " + eq1Linea2);
        System.out.println("Equipo 4 : " + eq2Linea2);
        */


        //AHORA SEPARAREMOS DE PRONOSTICO, LOS EQUIPOS DE LA ELECCION
        String equipo1Pronostico1 = pronosticoLinea1[0];
        String equipo2Pronostico1 = pronosticoLinea1[4];
        String equipo1Pronostico2 = pronosticoLinea2[0];
        String equipo2Pronostico2 = pronosticoLinea2[4];
        /* PRUEBA
        System.out.println("1er Equipo del Pronostico: " + equipo1Pronostico1);
        System.out.println("2do Equipo del Pronostico: " + equipo2Pronostico1);
        System.out.println("3er Equipo del Pronostico: " + equipo1Pronostico2);
        System.out.println("4to Equipo del Pronostico: " + equipo2Pronostico2);
        */

        // TOMAMOS LOS VALORES DE LAS ELECCIONES EN UN NUEVO ARREGLO, NO ES NECESARIO CAMBIARLE EL TIPO
        String[] pronosticoPartido1 = {pronosticoLinea1[1],pronosticoLinea1[2],pronosticoLinea1[3]};
        String[] pronosticoPartido2 = {pronosticoLinea2[1],pronosticoLinea2[2],pronosticoLinea2[3]};
        /*  PRUEBA
        System.out.print("Gana1: " + pronosticoPartido1[0] + "\n");
        System.out.print("Empate: " + pronosticoPartido1[1] + "\n");
        System.out.print(". Gana2: " + pronosticoPartido1[2] + "\n");
        System.out.print(". Gana1: " + pronosticoPartido2[0] + "\n");
        System.out.print(". Empate: " + pronosticoPartido2[1] + "\n");
        System.out.print(". Gana2: " + pronosticoPartido2[2]);
        */


        //CREAMOS UNA FUNCION 'calcularPronostico' QUE DEVUELVA EL RESULTADO DEL PRONOSTICO
        String pronosticoPart1 = calcularPronostico(pronosticoPartido1);//GANA EQUIPO1
        String pronosticoPart2 = calcularPronostico(pronosticoPartido2);// EMPATE

        /* PRUEBA
        System.out.println("PRONOSTICO PARTIDO 1: " + calcularPronostico(pronosticoPartido1) + "\n");
        System.out.println("PRONOSTICO PARTIDO 2: " + calcularPronostico(pronosticoPartido2));
        */

        //CREAMOS LOS OBJETOS DE LA CLASE EQUIPO
        Equipo equipo1 = new Equipo(eq1Linea1, "CONMEBOL");
        Equipo equipo2 = new Equipo(eq2Linea1, "AFC");
        Equipo equipo3 = new Equipo(eq1Linea2, "UEFA");
        Equipo equipo4 = new Equipo(eq2Linea2, "CONCACAF");
        /*
        System.out.println("Equipo 1: " + equipo1.getNombre() + "\n");
        System.out.println("Clasificado de la: " + equipo1.getDescripcion() + "\n");
        System.out.println("Equipo 2: " + equipo2.getNombre() + "\n");
        System.out.println("Clasificado de la: " + equipo2.getDescripcion() + "\n");
        System.out.println("Equipo 3: " + equipo3.getNombre() + "\n");
        System.out.println("Clasificado de la: " + equipo3.getDescripcion() + "\n");
        System.out.println("Equipo 4: " + equipo4.getNombre() + "\n");
        System.out.println("Clasificado de la: " + equipo4.getDescripcion());
        */


        //CREAMOS LOS OBJETOS DE LA CLASE PARTIDO
        Partido partido1 = new Partido(equipo1, equipo2, golesLinea1Eq1, golesLinea1Eq2);
        Partido partido2 = new Partido(equipo3, equipo4, golesLinea2Eq1, golesLinea2Eq2);

        /*PRUEBA
        System.out.println(partido1.getEquipo1().getNombre().toString() + " vs " + partido1.getEquipo2().getNombre().toString());
        System.out.println("Resultado Final: " + partido1.getGolesEquipo1() + " a " + partido1.getGolesEquipo2());
        System.out.println(partido2.getEquipo1().getNombre().toString() + " vs " + partido2.getEquipo2().getNombre().toString());
        System.out.println("Resultado Final: " + partido2.getGolesEquipo1() + " a " + partido2.getGolesEquipo2());
        */


        //CREAMOS OBJETO DE LA CLASE PRONOSTICO
        Pronostico pronostico1 = new Pronostico(partido1, pronosticoPart1,equipo1,equipo2);
        Pronostico pronostico2 = new Pronostico(partido2, pronosticoPart2,equipo3, equipo4);
        ///*
        System.out.println("Equipo 1 del Pronostico: " + pronostico1.getEquipo1().getNombre());
        System.out.println("Equipo 2 del Pronostico: " + pronostico1.getEquipo2().getNombre());
        System.out.println("Equipo 3 del Pronostico: " + pronostico2.getEquipo1().getNombre());
        System.out.println("Equipo 4 del Pronostico: " + pronostico2.getEquipo2().getNombre());
        System.out.println("Resultado del Partido 1: " + pronostico1.getPartido().getResultado());
        System.out.println("Resultado del Pronostico 1: " + pronostico1.getResultado());
        System.out.println("Resultado del Partido 2: " + pronostico2.getPartido().getResultado());
        System.out.println("Resultado del Pronostico 2: " + pronostico2.getResultado());


        //*/



    }

    // FUNCIONES

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
        if (pronosticoPartido[0].equals("X")) {
            return "GANA EQUIPO 1";
        } else if (pronosticoPartido[1].equals("X")) {
            return "EMPATE";
        } else{
            return "GANA EQUIPO 2";
        }
    }



}