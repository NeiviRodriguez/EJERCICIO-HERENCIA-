public class EMPLEADO_VENTAS extends EMPLEADO {
    private double TOTAL_VENTAS;
    private int PORCENTAJE_COMISION;

    // CONSTRUCTOR VACIO


    public EMPLEADO_VENTAS() {
    }

    // CONSTRUCTOR DE PARAMETROS (bien)


    public EMPLEADO_VENTAS(String IDENTIFICACION, String NOMBRE, int EDAD, double SALARIO_BASE, double TOTAL_VENTAS, int PORCENTAJE_COMISION) {
        super(IDENTIFICACION, NOMBRE, EDAD, SALARIO_BASE);
        this.TOTAL_VENTAS = TOTAL_VENTAS;
        this.PORCENTAJE_COMISION = PORCENTAJE_COMISION;
    }

    // GETTER AND SETTER


    public double getTOTAL_VENTAS() {
        return TOTAL_VENTAS;
    }

    public void setTOTAL_VENTAS(double TOTAL_VENTAS) {
        this.TOTAL_VENTAS = TOTAL_VENTAS;
    }

    public int getPORCENTAJE_COMISION() {
        return PORCENTAJE_COMISION;
    }

    public void setPORCENTAJE_COMISION(int PORCENTAJE_COMISION) {
        this.PORCENTAJE_COMISION = PORCENTAJE_COMISION;
    }

    // TO STRING DE LA CLASE HIJA

    @Override
    public String toString() {
        return super.toString()+"EMPLEADO_VENTAS{" +
                "TOTAL_VENTAS=" + TOTAL_VENTAS +
                ", PORCENTAJE_COMISION=" + PORCENTAJE_COMISION +
                '}';
    }


    //MOSTRAR INFO

    public void MOSTRAR_INFO () {
        System.out.println("EMPLEADO=");
        System.out.println("IDENTIFICACION='" + IDENTIFICACION);
        System.out.println("NOMBRE=" + NOMBRE);
        System.out.println("EDAD=" + EDAD);
        System.out.println("SALARIO_BASE=" + SALARIO_BASE);
    }



}
