public class EMPLEADO_HORAS extends EMPLEADO{
    //ATRIBUTOS
    private double HORAS_TRABAJADAS;
    private double VALOR_HORAS;

    //CONSTRUCTOR VACIO DE CLASE HIJA SIN ENTRAR

    public EMPLEADO_HORAS() {
    }


    //CONSTRUCTOR CON PARAMETROS DE LA CLASE HIJA(ENTRAR Y SELECCIONAR)

    public EMPLEADO_HORAS(String IDENTIFICACION, String NOMBRE, int EDAD, double SALARIO_BASE, double HORAS_TRABAJADAS, double VALOR_HORAS) {
        super(IDENTIFICACION, NOMBRE, EDAD, SALARIO_BASE);
        this.HORAS_TRABAJADAS = HORAS_TRABAJADAS;
        this.VALOR_HORAS = VALOR_HORAS;
    }


    //GETTER AND SETTER


    public double getHORAS_TRABAJADAS() {
        return HORAS_TRABAJADAS;
    }

    public void setHORAS_TRABAJADAS(double HORAS_TRABAJADAS) {
        this.HORAS_TRABAJADAS = HORAS_TRABAJADAS;
    }

    public double getVALOR_HORAS() {
        return VALOR_HORAS;
    }

    public void setVALOR_HORAS(double VALOR_HORAS) {
        this.VALOR_HORAS = VALOR_HORAS;
    }

    //TO STRING CLASE HIJA


    @Override
    public String toString() {
        return super.toString()+"EMPLEADO_HORAS{" +
                "HORAS_TRABAJADAS=" + HORAS_TRABAJADAS +
                ", VALOR_HORAS=" + VALOR_HORAS +
                '}';
    }

    //METODOS
    public void MOSTRAR_INFO () {
        System.out.println("EMPLEADO=");
        System.out.println("IDENTIFICACION='" + IDENTIFICACION);
        System.out.println("NOMBRE=" + NOMBRE);
        System.out.println("EDAD=" + EDAD);
        System.out.println("SALARIO_BASE=" + SALARIO_BASE);


    }
}
