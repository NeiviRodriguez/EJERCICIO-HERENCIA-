//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.util.*;
void main() {

    Scanner teclado = new Scanner(System.in);

    List<EMPLEADO>LISTA_EMPLEADOS= new ArrayList<>();

        int opcion ;
        boolean ENCONTRAR= false;

        //METODO

    do {
            System.out.println("""
                ELIGE UNA OPCION:
               
                1.REGISTRAR EMPLEADO ADMINISTRATIVO
                2.REGISTRAR EMPLEADO VENTAS
                3.REGISTRAR EMPLEADO HORAS
                4.MOSTRAR INFORMACION DE TODOS LOS EMPLEADOS
                5.MOSTRAR EMPLEADO POR TIPO (SUBMENU E VENTAS, E HORAS, E ADMIN)
                6.BUSCAR EMPLEADO (SUBMENU CALCULAR SI ES MAYOR DE EDAD, CALCULAR SALARIO, AUMENTAR  EL SALARIO)
                
                """);
            opcion= teclado.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("DIGITA EL NUMERO DE DOCUMENTO: ");
                String DOCUMENTO=  teclado.next();
                System.out.println("DIGITA EL NOMBRE: ");
                String NOMBRE=  teclado.next();
                System.out.println("DIGITA LA EDAD: ");
                int EDAD=  teclado.nextInt();
                System.out.println("DIGITA EL SALARIO : ");
                int SALARIO=  teclado.nextInt();
                System.out.println("DIGITA LA BONIFICACIÓN: ");
                int BONIFICACION=  teclado.nextInt();
                EMPLEADO_ADMINISTRATIVO EA1=new EMPLEADO_ADMINISTRATIVO(DOCUMENTO, NOMBRE, EDAD, SALARIO, BONIFICACION);
                LISTA_EMPLEADOS.add(EA1);
                break;
        case 2:
            System.out.println("DIGITA EL NUMERO DE DOCUMENTO: ");
            DOCUMENTO=  teclado.next();
            System.out.println("DIGITA EL NOMBRE: ");
            NOMBRE = teclado.next();
            System.out.println("DIGITA LA EDAD: ");
            EDAD=  teclado.nextInt();
            System.out.println("DIGITA EL SALARIO : ");
            SALARIO=  teclado.nextInt();
            System.out.println("DIGITA EL TOTAL DE VENTAS");
            double TOTAL_VENTAS= teclado.nextDouble();
            System.out.println("INGRESA EL VALOR DE LA COMISION");
            int PORCENTAJE_COMISION = teclado.nextInt();
            EMPLEADO_VENTAS EV1=new EMPLEADO_VENTAS(DOCUMENTO,NOMBRE,EDAD,SALARIO,TOTAL_VENTAS,PORCENTAJE_COMISION);
            LISTA_EMPLEADOS.add(EV1);

            break;

            case 3:
                System.out.println("DIGITA EL NUMERO DE DOCUMENTO: ");
                DOCUMENTO=  teclado.next();
                System.out.println("DIGITA EL NOMBRE: ");
                NOMBRE = teclado.next();
                System.out.println("DIGITA LA EDAD: ");
                EDAD=  teclado.nextInt();
                System.out.println("DIGITA EL SALARIO : ");
                SALARIO=  teclado.nextInt();
                System.out.println("DIGITA LA CANTIDAD DE HORAS TRABAJADAS");
                double HORAS_TRABAJADAS = teclado.nextDouble();
                System.out.println("DIGITA EL VALOR DE LA HORA");
                double VALOR_HORAS = teclado.nextDouble();
                //double TOTAL_HORAS;=HORAS_TRABAJADAS*VALOR_HORAS;
                EMPLEADO_HORAS EH1=new EMPLEADO_HORAS(DOCUMENTO,NOMBRE,EDAD,SALARIO,HORAS_TRABAJADAS,VALOR_HORAS);
                LISTA_EMPLEADOS.add(EH1);

                break;

            case 4:
                System.out.println(LISTA_EMPLEADOS);

                break;

            case 5:
                System.out.println("""
                        DIGITA QUE TIPO DE EMPLEADO QUIERES VER: 
                        
                        1.MOSTRAR EMPLEADO ADMINISTRATIVO
                        2.MOSTRAR EMPLEADO VENTAS
                        3.MOSTRAR EMPLEADO POR HORAS
                        """);
                int opcion2= teclado.nextInt();

                switch (opcion2){
                    case 1:
                        for(EMPLEADO E : LISTA_EMPLEADOS){
                            if(E instanceof EMPLEADO_ADMINISTRATIVO){
                                System.out.println(E);
                            }
                        }
                    case 2:
                        for(EMPLEADO E : LISTA_EMPLEADOS){
                            if(E instanceof EMPLEADO_VENTAS){
                                System.out.println(E);
                            }
                        }
                    case 3:
                        for(EMPLEADO E : LISTA_EMPLEADOS){
                            if(E instanceof EMPLEADO_HORAS){
                                System.out.println(E);
                            }
                        }
                    default:
                        System.out.println("DIGITE UNA OPCION VALIDA");

                }
            case 6:

                String BUSCAR= teclado.next();


                for (EMPLEADO EMPL : LISTA_EMPLEADOS) {
                    if (EMPL.getIDENTIFICACION().equals(BUSCAR))
                        System.out.println(EMPL);
                        ENCONTRAR=true;
                        break;
                    }
                }
                if(ENCONTRAR==false){
                    System.out.println("""
                            1.AUMENTAR SALARIO
                            2.CALCULAR SALARIO
                            3.VALIDAR SI ES MAYOR DE EDAD 
                            """);
                    int opcion3= teclado.nextInt();

                    switch(opcion3){



                    }
                }else{
                    System.out.println("IDENTIFICACION NO ENCONTRADA");

                }




    } while (opcion != 6);




}