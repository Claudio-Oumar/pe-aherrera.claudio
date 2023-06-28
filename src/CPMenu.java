import CPUtilitario.CPColor;
import CPUtilitario.CPUtility;


public class CPMenu {
    private static final String cpusuario = "profe";

    public void menu1() {
        String cpopcion = "";

        while (!cpopcion.equals("0")) {
            System.out.println("\n");
            System.out.println("------------------------------------------");
            System.out.println(CPColor.cpBOLD_BLACK + "Carga horaria de Profesores");
            System.out.println("------------------------------------------");
            System.out.println(CPColor.cpBLUE + "Usuario:" + CPColor.cpPURPLE +cpusuario.toUpperCase());
            System.out.println("\n");
            System.out.println(CPColor.cpGREEN + "1 Visualizar Profesores");
            System.out.println(CPColor.cpGREEN + "2 Visualizar Asignaturas");
            System.out.println(CPColor.cpGREEN + "3 Visualizar Horario");
            System.out.println(CPColor.cpGREEN + "4 Visualizar Horario de una asignatura");
            System.out.println(CPColor.cpGREEN + "0 SALIR");
            System.out.println();
            System.out.println( "\nIngresa una opción: ");
            cpopcion = CPUtility.sc.nextLine();
            
            switch (cpopcion) {
                case "1":
                System.out.println(CPColor.cpBOLD_CYAN+ "[+] Listado de Profesores :");
                    cpVisualizarProfesores();
                    break;
                case "2":
                    cpVisualizarAsignaturas();
                    break;
                case "3":
                    cpVisualizarHorario();
                    break;
                case "4":
                    cpVisualizarHorarioAsignatura();
                    break;
                case "0":
                    System.out.println("\nRegresa pronto " + cpusuario.toUpperCase());
                    break;
                default:
                    System.out.println(CPColor.cpBOLD_RED+"\nOpción inválida. Intenta de nuevo por favor.");
                    break;
            }
            System.out.println();
        }
        CPUtility.sc.close();
    }
    private static void cpVisualizarHorarioAsignatura() {

    }
    private static void cpVisualizarHorario() {
    }

    private static void cpVisualizarAsignaturas() {
    }

    private static void cpVisualizarProfesores() {
    }
    
}
