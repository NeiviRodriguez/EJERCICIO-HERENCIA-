public class EMPLEADO_ADMINISTRATIVO extends EMPLEADO {
    private double BONIFICACION_FIJA;

    //constructor vacio

    public EMPLEADO_ADMINISTRATIVO() {
    }


    //CONSTRUCTOR CON PARAMETROS

    public EMPLEADO_ADMINISTRATIVO(String IDENTIFICACION, String NOMBRE, int EDAD, double SALARIO_BASE, double BONIFICACION_FIJA) {
        super(IDENTIFICACION, NOMBRE, EDAD, SALARIO_BASE);
        this.BONIFICACION_FIJA = BONIFICACION_FIJA;
    }


    //GETTER AND SETTER

    public double getBONIFICACION_FIJA() {
        return BONIFICACION_FIJA;
    }

    public void setBONIFICACION_FIJA(double BONIFICACION_FIJA) {
        this.BONIFICACION_FIJA = BONIFICACION_FIJA;
    }

    //TO STRING


    @Override
    public String toString() {
        return super.toString()+"EMPLEADO_ADMINISTRATIVO{" +
                "BONIFICACION_FIJA=" + BONIFICACION_FIJA +
                '}';
    }

    //METODOS

    public void MOSTRAR_INFO() {
        System.out.println("EMPLEADO=");
        System.out.println("IDENTIFICACION='" + IDENTIFICACION);
        System.out.println("NOMBRE=" + NOMBRE);
        System.out.println("EDAD=" + EDAD);
        System.out.println("SALARIO_BASE=" + SALARIO_BASE);


    }
}
