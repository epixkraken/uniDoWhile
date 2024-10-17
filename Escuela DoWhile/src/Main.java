//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/***Descripción del programa:**
 Realice un programa que simula un sistema básico de gestión educativa.
 Contiene tres clases: `Estudiante`, `Curso` y `Universidad`, cada una
 con atributos que representan sus características principales.
 Se implementan métodos `getter` y `setter` para acceder y modificar
 los atributos, así como tres constructores para crear instancias de cada
 clase de distintas maneras. Esto proporciona una base para la gestión de
 información académica en una institución.*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Cantidad cant = new Cantidad();
        int var12;
        System.out.println("CANTIDAD ESTUDIANTES");
        var12 = Integer.parseInt(br.readLine());
        cant.setCantidad(var12);
        int i = 0;

        do {

            Universidad uni = new Universidad();
            //Input Data
            String var1;
            System.out.println("Universidad: ");
            var1 = br.readLine();
            System.out.println("");
            uni.setNombre(var1);

            String var2;
            System.out.println("Direccion: ");
            var2 = br.readLine();
            System.out.println("");
            uni.setDireccion(var2);


            Estudiante student = new Estudiante();

            //Input Data

            String var3;
            System.out.println("Nombre: ");
            var3 = br.readLine();
            System.out.println("");
            student.setNombre(var3);

            int var4;
            System.out.println("Edad: ");
            // cambiar de int a string
            var4 = Integer.parseInt(br.readLine());
            System.out.println("");
            student.setEdad(var4);

            String var5;
            System.out.println("Carrera: ");
            var5 = br.readLine();
            System.out.println("");
            student.setCarrera(var5);



            Materias materia = new Materias();
            Notas nota = new Notas();
            //Input Data
            String var6;
            System.out.println("Materia 1: ");
            var6 = br.readLine();
            materia.setMatematicas(var6);

            int var7;
            System.out.println("Nota: ");
            var7 = Integer.parseInt(br.readLine());
            nota.setNota1(var7);

            String var8;
            System.out.println("Materia 2: ");
            var8 = br.readLine();
            materia.setCiencia(var8);

            int var9;
            System.out.println("Nota: ");
            var9 = Integer.parseInt(br.readLine());
            nota.setNota2(var9);

            String var10;
            System.out.println("Materia 3: ");
            var10 = br.readLine();
            materia.setLenguaje(var10);

            int var11;
            System.out.println("Nota: ");
            var11= Integer.parseInt(br.readLine());
            nota.setNota3(var11);

            //Print Uni
            System.out.println("" + uni.detalleUniversidad());
            //Print Student
            System.out.println("" + student.detalleEstudiante());
            //Print Materias y Notas
            System.out.println("" + var6 + " " + var7 + "\n" + var8 + " " + var9 + "\n" + var10 + " " + var11 );
            System.out.println("");
            i ++;



        } while (i < var12);

        System.out.println("FIN DEL PROGRAMA");

    }

}