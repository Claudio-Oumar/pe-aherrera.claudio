import java.util.Scanner;

import CPUtilitario.CPUtility;

public class App {
    private static final int cpCEDULA =1755501044;
    private static final String cpNOMBRE = "CLAUDIO PEÑAHERRERA";
    private static final String cpCORREO = "claudio.penaherrera@epn.edu.ec";
    public static void main(String[] args) throws Exception {
        cppresentarDatos();
        pplong();
        
    }

    private static void pplong() {
        int cpintentosRestantes = 3;
        while (cpintentosRestantes>0) {
            System.out.println("Uruario: ");
            String cpusuario = CPUtility.sc.nextLine();
            System.out.println("Clave: ");
            String cpclave = CPUtility.sc.nextLine();
            if (cpvalidarCredenciales(cpusuario,cpclave)) {
                System.out.println("::Bienvenido " +cpusuario.toUpperCase());
                return;
            }else{
                cpintentosRestantes--;
                System.out.println("Nro de intentos restantes: "+cpintentosRestantes);

                if (cpintentosRestantes==0) {
                    System.out.println("Lo sentimos, tus credenciales son incorrectas...!");
                    break;
                }    
            }
        }
        System.out.println("Grcias");
        
    }

    private static boolean cpvalidarCredenciales(String cpusuario, String cpclave) {
        String cpUsuario2 = "profe";
        String cpClave2 = "1234";
        
        if (cpusuario.equals(cpCORREO)&& cpclave.equals(cpCEDULA)) {
            return true;
        }else if (cpusuario.equals(cpUsuario2)&& cpclave.equals(cpClave2)) {
            return true;
        }
        return false;
    }

    private static void cppresentarDatos() {
        System.out.println("-CEDULA: "+cpCEDULA);
        System.out.println("-CORREO: "+cpCORREO);
        System.out.println("-NOMBRE: "+cpNOMBRE);


    }


}
