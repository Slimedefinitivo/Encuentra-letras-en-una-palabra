import javax.swing.*;

public class AdivinaContrasena {

    public static void main(String[] args) {

        Desarrollo desarrollo = new Desarrollo();

        int opcion;

        String msj = """                                                            
                Menu.
                 1. Primer digito\s
                2. Segundo digito".
                3. Tercer digito.
                4. Cuarto digito.
                5. Quinto digito
                6. Salir""";

        do {

            opcion = demeNumero(msj);
            switch (opcion) {
                case 1:

                    String dato= JOptionPane.showInputDialog("Ingrese una letra");
                    if (desarrollo.uno(dato)){
                        System.out.println(dato+"----");
                    }else{
                        System.out.println("Letra no encontrada");
                    }

                    break;

                case 2:

                    String datoDos= JOptionPane.showInputDialog("Ingrese una letra");
                    if (desarrollo.dos(datoDos)){
                        System.out.println("-"+datoDos+"---");
                    }else{
                        System.out.println("Letra no encontrada");
                    }

                    break;

                case 3:

                    String datoTres= JOptionPane.showInputDialog("Ingrese una letra");
                    if (desarrollo.tres(datoTres)){
                        System.out.println("--"+datoTres+"--");
                    }else{
                        System.out.println("Letra no encontrada");
                    }


                    break;

                case 4:

                    String datoCuatro= JOptionPane.showInputDialog("Ingrese una letra");
                    if (desarrollo.cuatro(datoCuatro)){
                        System.out.println("---"+datoCuatro+"-");
                    }else{
                        System.out.println("Letra no encontrada");
                    }

                    break;

                case 5:
                    String datoCinco= JOptionPane.showInputDialog("Ingrese una letra");
                    if (desarrollo.cinco(datoCinco)){
                        System.out.println("----"+datoCinco);
                    }else{
                        System.out.println("Letra no encontrada");
                    }


                    break;


                default:


            }
        } while (opcion != 6);
    }


    public static int demeNumero(String mensaje) {
        String respuesta = javax.swing.JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(respuesta);
    }
}
















