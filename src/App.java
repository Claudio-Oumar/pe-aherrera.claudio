import java.util.Scanner;

import CPUtilitario.CPColor;
import CPUtilitario.CPUtility;

public class App {
    private static final int cpCEDULA = 1755501044;
    private static final String cpNOMBRE = "CLAUDIO PEÑAHERRERA";
    private static final String cpCORREO = "claudio.penaherrera@epn.edu.ec";
    private static final String cpusuario = "profe";
    /**
     * Descripcion: Me imprime entrar la APP
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------");
        cppresentarDatos();
        pplong();
        cpclear();
        CPMenu cpMenu= new CPMenu();
        cpMenu.menu1();

    }
   
    /**
     * Descripcion: Ingresar el usario y contraseña
     */
    private static void pplong() {
        int cpintentosRestantes = 3;
        while (cpintentosRestantes > 0) {
            System.out.println("\n");
            System.out.println("------------------------------------------");
            System.out.print(CPColor.cpRED + "\t+ usuario: ");
            String cpusuario = CPUtility.sc.nextLine();
            System.out.print(CPColor.cpGREEN + "\t+ clave: ");
            String cpclave = CPUtility.sc.nextLine();
            System.out.println("------------------------------------------");
            if (cpvalidarCredenciales(cpusuario, cpclave)) {
                System.out.println("\n");
                System.out.println(CPColor.cpPURPLE + "\t::Bienvenido " + cpusuario.toUpperCase());
                return;
            } else {
                cpintentosRestantes--;
                System.out.println("------------------------------------------");
                System.out.println(CPColor.cpRED + "* Nro de intentos restantes: " + cpintentosRestantes);

                if (cpintentosRestantes == 0) {
                    System.out.println("------------------------------------------");
                    System.out.println(CPColor.cpYELLOW + "Lo sentimos, tus credenciales son incorrectas...!");
                    break;
                }
            }
        }
        System.exit(0);

    }

    private static void cpclear() {
    }
    /**
     * Descripcion: Validar las credenciales
     * @param cpusuario
     * @param cpclave
     * @return
     */
    private static boolean cpvalidarCredenciales(String cpusuario, String cpclave) {
        String cpUsuario2 = "profe";
        String cpClave2 = "1234";

        if (cpusuario.equals(cpCORREO) && cpclave.equals(cpCEDULA)) {
            return true;
        } else if (cpusuario.equals(cpUsuario2) && cpclave.equals(cpClave2)) {
            return true;
        }
        return false;
    }
    
    /**
     * Descripcion imprime credenciales
     * @param cpCEDULA
     */
    private static void cppresentarDatos() {
        System.out.println(CPColor.cpBACKGROUND_BLACK+"-CEDULA: " + cpCEDULA);
        System.out.println(CPColor.cpBACKGROUND_BLACK+"-CORREO: " + cpCORREO);
        System.out.println(CPColor.cpBACKGROUND_BLACK+"-NOMBRE: " + cpNOMBRE);

    }

}
