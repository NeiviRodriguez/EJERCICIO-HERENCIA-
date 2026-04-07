import java.util.Scanner;

public class EMPLEADO {
    protected String IDENTIFICACION;
    protected String NOMBRE;
    protected int EDAD;
    protected double SALARIO_BASE;


    Scanner teclado = new Scanner(System.in);


    //CONSTRUCTOR VACIO


    public EMPLEADO() {
    }

    //CONSTRUCTOR CON PARÁMETROS

    public EMPLEADO(String IDENTIFICACION, String NOMBRE, int EDAD, double SALARIO_BASE) {
        this.IDENTIFICACION = IDENTIFICACION;
        this.NOMBRE = NOMBRE;
        this.EDAD = EDAD;
        this.SALARIO_BASE = SALARIO_BASE;
    }


    // GETTER AND SETTER

    public String getIDENTIFICACION() {
        return IDENTIFICACION;
    }

    public void setIDENTIFICACION(String IDENTIFICACION) {
        this.IDENTIFICACION = IDENTIFICACION;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public double getSALARIO_BASE() {
        return SALARIO_BASE;
    }

    public void setSALARIO_BASE(double SALARIO_BASE) {
        this.SALARIO_BASE = SALARIO_BASE;
    }

    //TO STRING


    @Override
    public String toString() {
        return "EMPLEADO{" +
                "IDENTIFICACION='" + IDENTIFICACION + '\'' +
                ", NOMBRE='" + NOMBRE + '\'' +
                ", EDAD=" + EDAD +
                ", SALARIO_BASE=" + SALARIO_BASE +
                '}';
    }

    //METODOS

    public void MOSTRAR_INFO () {
        System.out.println( "EMPLEADO=");
        System.out.println( "IDENTIFICACION='" + IDENTIFICACION);
        System.out.println("NOMBRE=" + NOMBRE );
        System.out.println( "EDAD=" + EDAD );
        System.out.println("SALARIO_BASE=" + SALARIO_BASE );

    }

    double AUMENTAR;
    //METODOS SWITCH
    //AUMENTAR SALARIO
    public double AUMENTAR_SALARIO(){
        System.out.println("DIGITE EL VALOR A AUMENTAR");
        return AUMENTAR= teclado.nextDouble();
    }


    //CALCULAR SALARIO
    public double CALCULAR_SALARIO(double TOTAL_SALARIO){
        return SALARIO_BASE+AUMENTAR;

    }

   //CALCULAR SI ES MAYOR DE EDAD
    public int MAYOR_DE_EDAD(int VEDAD) {
    if (EDAD>=18) {
        System.out.println("ES MAYOR DE EDAD");

    }else{
        System.out.println("NO ES MAYOR DE EDAD");
    }

    }




    }




