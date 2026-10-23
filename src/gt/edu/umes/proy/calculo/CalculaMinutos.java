package gt.edu.umes.proy.calculo;

public class CalculaMinutos {
//prueba2
    public static void main(String[] args) {
        LogicaDelNegocio logica = new LogicaDelNegocio();

        if (!logica.validar(args)) {
            System.out.println("Error: debe ingresar exactamente 5 parámetros enteros "
                + "(meses semanas días horas minutos).");
            return;
        }

        System.out.println("Total en segundos: " + logica.calcular(args));
    }
}