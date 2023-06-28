import java.io.File;

import CPUtilitario.CPColor;
import CPUtilitario.CPUtility;

public class CPMenu {
    private static final String cpusuario = "profe";

    /**
     * Descripcion: Me imprime el menu principal
     */
    public void menu1() {
        String cpopcion = "";

        while (!cpopcion.equals("0")) {
            System.out.println("\n");
            System.out.println("------------------------------------------");
            System.out.println(CPColor.cpBOLD_BLACK + "Carga horaria de Profesores");
            System.out.println("------------------------------------------");
            System.out.println(CPColor.cpBLUE + "Usuario:" + CPColor.cpPURPLE + cpusuario.toUpperCase());
            System.out.println("\n");
            System.out.println(CPColor.cpGREEN + "1 Visualizar Profesores");
            System.out.println(CPColor.cpGREEN + "2 Visualizar Asignaturas");
            System.out.println(CPColor.cpGREEN + "3 Visualizar Horario");
            System.out.println(CPColor.cpGREEN + "4 Visualizar Horario de una asignatura");
            System.out.println(CPColor.cpGREEN + "0 SALIR");
            System.out.println();
            System.out.println("\nIngresa una opción: ");

            cpopcion = CPUtility.sc.nextLine();
            CPHorario sp = new CPHorario();

            switch (cpopcion) {
                case "1":
                System.out.println("[+] Listado de Profesor");
                    File micarpeta= new File("SRC\\Horario");
                            File[] listaFicheros=micarpeta.listFiles();
                            for (File file : listaFicheros) {
                            System.out.println(file.toString());
                            CPHorario.sp(file.toString());
                            }
                    break;
                case "2":
                    System.out.println("[+] Listado de Profesor");
                    System.out.print("\u001B[34m");
                    System.out.println(
                            "\n\t-ICCD323-GRLSW        SISTEMAS OPERATIVOS SISTEMAS OPERATIVOS\n\t-ICCD343-GR1SW        CONTACTO CON LA MUSICA\n\t-ICCD343-GR1SW        ARQUITECTURA DE COMPUTADORES\n\t-MATD223-GR4SW        PROBABILIDAD Y ESTADISTiCABASICAS\n\t-CSHD3BL-A3           FUNDAMENTOS DE REDES Y CONECTIVIDAD\n\t-ICCD353-GR1SW        FUNDAMENTOS DE REDES Y CONECTIVIDAD");
                    System.out.print("\u001B[0m");

                    // cpVisualizarAsignaturas();
                    break;
                case "3":
                    // cpVisualizarHorario();
                    break;
                case "4":
                    // cpVisualizarHorarioAsignatura();
                    break;
                case "0":
                    System.out.println("\nRegresa pronto " + cpusuario.toUpperCase());
                    break;
                default:
                    System.out.println(CPColor.cpBOLD_RED + "\nOpción inválida. Intenta de nuevo por favor.");
                    break;
            }
            System.out.println();
        }
        CPUtility.sc.close();
    }

}
