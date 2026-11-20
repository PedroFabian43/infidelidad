public class Expediente{

    public static final String FICHA = "Partner: [%s] | Expediente: [%d] | Créditos: [%d]";
    public static final String NOMBRE_BASE = "SOCIO ANONIMO";
    public static final int FACTOR = 4;
    public static final int BONO_COMERCIAL = 250;

    private static int contador;

    private int id;
    private String razonSocial;
    private int creditos;

    public Expediente(){
        razonSocial = NOMBRE_BASE;
        id = contador;
        contador++;
    }

    public Expediente(String razonSocial, int creditos){
        this.razonSocial = razonSocial.trim().toUpperCase();
        this.creditos = creditos;
        id = contador;
        contador++;
    }

    public void acumular(int cantidad){
        creditos += cantidad;
    }

    public void activarPaquete(){
        acumular(BONO_COMERCIAL);
    }

    public String consultarFicha(){
        return String.format(FICHA, razonSocial, id, creditos);
    }

    public int calcularExclusividad(){
        return creditos * FACTOR;
    }
}