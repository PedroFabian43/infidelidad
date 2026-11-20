import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        final String PETICION_RAZON = "Razon Social de la empresa: ";
        final String PETICION_CREDITOS = "Créditos de la empresa: ";
        final int FACTOR = 2;

        String razonSocial;
        int creditos;

        Expediente expPer = null;
        Expediente expDef = null;

        Scanner sc = new Scanner(System.in);

        System.out.print(PETICION_CREDITOS);
        creditos = Integer.valueOf(sc.nextLine());

        System.out.print(PETICION_RAZON);
        razonSocial = sc.nextLine();

        expPer = new Expediente(razonSocial, creditos);
        
        System.out.println(expPer.consultarFicha());
        expPer.activarPaquete();
        System.out.println(expPer.consultarFicha());
        System.out.println(expPer.calcularExclusividad() * FACTOR);

        expDef = new Expediente();
        System.out.println(expDef.consultarFicha());

        sc.close();
    }

}
