package gt.edu.umes.proy.calculo;

public class LogicaDelNegocio {

    private static final long SEG_MINUTO = 60L;
    private static final long SEG_HORA = 3600L;
    private static final long SEG_DIA = 86400L;
    private static final long SEG_SEMANA = 7L * SEG_DIA;
    private static final long SEG_MES = 30L * SEG_DIA;

    /** Valida que sean exactamente 5 parámetros y que todos sean enteros. */
    public boolean validar(String[] args) {
        if (args == null || args.length != 5) {
            return false;
        }
        for (String a : args) {
            try {
                Integer.parseInt(a.trim());
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
    //Commit prueba que todo funcione 29 Octubre
    //Commit 23 Octubre 2026 fase I
    /** Calcula el total en segundos. */
    public long calcularSegundos(int meses, int semanas, int dias, int horas, int minutos) {
        return meses * SEG_MES
             + semanas * SEG_SEMANA
             + dias * SEG_DIA
             + horas * SEG_HORA
             + minutos * SEG_MINUTO;
    }

    /** Valida y calcula a partir de los argumentos de la línea de comandos. */
    public long calcular(String[] args) {
        return calcularSegundos(
            Integer.parseInt(args[0].trim()),
            Integer.parseInt(args[1].trim()),
            Integer.parseInt(args[2].trim()),
            Integer.parseInt(args[3].trim()),
            Integer.parseInt(args[4].trim()));
    }
}