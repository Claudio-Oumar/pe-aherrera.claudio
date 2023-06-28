package CPUtilitario;

import java.util.Scanner;

public class CPUtility {
    private static final int cpdelay = 100; 
   public static  Scanner sc = new Scanner(System.in);

    public  static int cpGetcpNumeroPositivo(String mensage) {
        int cpnumero;

        System.out.print(mensage);
        do {
            cpnumero = sc.nextInt();  
        } while (cpnumero <= 0);
        // sc.close();

        return cpnumero;
    }

    /**
     * limpia la consola
     */
    public final static void cpclear()
    {
        try {
            String cpoperatingSystem = System.getProperty("os.name");     //Check the current operating system
              
            if(cpoperatingSystem.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("cpclear").inheritIO().start().waitFor();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static void cpshowloadingcpBarra(int cpsizecpBarra) throws InterruptedException{
        char[] cpbarra = new char[cpsizecpBarra];
        float cppocentaje = (float)100/(float)cpsizecpBarra;
        for(int i = 0; i < cpsizecpBarra; i++)
            cpbarra[i]=' ';

        for(int i = 0; i <= cpsizecpBarra; i++) {
            if(i< (cpsizecpBarra-1))
                cpbarra[i]='#';
            StringBuilder sbcpBarra = new StringBuilder("").append(cpbarra);
            System.out.print(String.format("\r[%s] %3.0f %%", sbcpBarra, i*cppocentaje));
            Thread.sleep(cpdelay);
        }
        System.out.println("");
    }
    public static void cpshowloading() throws InterruptedException {     
        String cpstrCaracter = "\\|/-";  // [ \ | / - | ]
        for (int i = 0; i <= 100; i++) {
            System.out.print(String.format("\r %s %3d %% ",cpstrCaracter.charAt(i % cpstrCaracter.length()),i));
            Thread.sleep(cpdelay);
        }
    }
}
