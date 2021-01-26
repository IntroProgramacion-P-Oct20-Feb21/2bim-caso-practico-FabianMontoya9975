/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casopractico;

import java.util.Scanner;

/**
 *
 * @author josef
 */
public class CasoPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion1;
        String opcion2;
        int contadorCuentas = 1;
        boolean bandera = true;
        boolean bandera2 = true;

        do {
            System.out.println("Igresar 1 para crear una cuenta en Facebook\n"
                    + "Ingresar 2 para crear una cuenta de Twitter\n"
                    + "Ingresar 3 para crear una cuenta en Whatsapp\n"
                    + "Ingresar 4 para crear una cuenta en Telegram\n"
                    + "Ingresar 5 para crear una cuenta en Signal\n"
                    + "Ingresar 6 para crear una cuenta en Instagram\n"
                    + "Ingresar 7 para crear una cuenta en Flickr: ");
            opcion1 = entrada.nextInt();
            entrada.nextLine();
            switch (opcion1) {
                case 1:
                    crearFacebook();
                    break;
                case 2:
                    crearTwitter();
                    break;
                case 3:
                    crearWhatsapp();
                    break;
                case 4:
                    crearTelegram();
                    break;
                case 5:
                    crearSignal();
                    break;
                case 6:
                    crearInstagram();
                    break;
                case 7:
                    crearFlickr();
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
            do {
                System.out.println("Escriba SI para crear mas cuentas\n"
                        + "Escriba NO para ya no crear mas cuentas: ");
                opcion2 = entrada.nextLine();
                opcion2 = opcion2.toLowerCase();
                if (opcion2.equals("no")) {
                    bandera = false;
                    bandera2 = false;
                    System.out.printf("%s\n", obtenerMensaje(contadorCuentas));
                } else {
                    if (opcion2.equals("si")) {
                        bandera2 = false;
                        contadorCuentas = contadorCuentas + 1;
                    } else {
                        System.out.println("Opción incorrecta.");
                    }
                }
            } while (bandera2);
        } while (bandera);
    }

    public static void crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        int edadUsuario;
        String ciudadUsuario;
        String paisUsuario;
        String correoUsuario;
        System.out.println("Usted escogió la opción crear cuenta en Facebook"
                + "\nIngresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edadUsuario = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        paisUsuario = entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correoUsuario = entrada.nextLine();
        System.out.printf("Resumen de cuenta creada en Facebook\n"
                + "Nombre del usuario: %s\n"
                + "Edad del usuario: %s\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n"
                + "Correo del usuario: %s\n",
                nombreUsuario, edadUsuario, ciudadUsuario, paisUsuario,
                correoUsuario);
    }
    
    public static void crearTwitter(){
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String nombres;
        String apellidos;
        int edadUsuario;
        String ciudadUsuario;
        String paisUsuario;
        String idiomaUsuario;
        String correoUsuario;
        System.out.print("Usted escogió la opción crear cuenta en Twitter\n"
                + "Ingresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar los nombres completos del Usuario: ");
        nombres = entrada.nextLine();
        System.out.println("Ingresar los apellidos completos del Usuario: ");
        apellidos = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edadUsuario = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        paisUsuario = entrada.nextLine();
        System.out.println("Ingresar el idioma que habla el Usuario: ");
        idiomaUsuario = entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correoUsuario = entrada.nextLine();
        System.out.printf("Resumen de cuenta creada en Twitter\n"
                + "Nombre del Usuario: %s\n"
                + "Nombres completos del Usuario: %s"
                + "Apellidos completos de usuario: %s\n"
                + "Edad del usuario: %d\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n"
                + "Idioma del usuario: %s\n"
                + "Correo del usuario: %s\n",
                nombreUsuario, nombres, apellidos, edadUsuario,
                ciudadUsuario, paisUsuario, idiomaUsuario, correoUsuario);
    }

    public static void crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String numeroTelefono;
        int edadUsuario;
        String ciudadUsuario;
        String paisUsuario;
        System.out.println("Usted escogió la opción crear cuenta en Whatsapp"
                + "\nIngresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar el número de teléfono del Usuario: ");
        numeroTelefono = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edadUsuario = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        paisUsuario = entrada.nextLine();
        System.out.printf("Resumen de cuenta creada en Whatsapp\n"
                + "Nombre del usuario: %s\n"
                + "Número del teléfono del usuario: %s\n"
                + "Edad del usuario: %d\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n",
                nombreUsuario, numeroTelefono, edadUsuario, ciudadUsuario,
                paisUsuario);
    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String numeroTelefono;
        String ciudadUsuario;
        String paisUsuario;
        String areaInteres;
        System.out.println("Usted escogió la opción crear cuenta en Telegram"
                + "\nIngresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar el número de teléfono del Usuario: ");
        numeroTelefono = entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        paisUsuario = entrada.nextLine();
        System.out.println("Ingresar el área de interés del Usuario: ");
        areaInteres = entrada.nextLine();
        System.out.printf("Resumen de cuenta creada en Telegram\n"
                + "Nombre del usuario: %s\n"
                + "Número del teléfono del usuario: %s\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n"
                + "Área de interés del usuario: %s\n",
                nombreUsuario, numeroTelefono, ciudadUsuario, paisUsuario,
                areaInteres);
    }

    public static void crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String numeroTelefono;
        String ciudadUsuario;
        String paisUsuario;
        String hobbyPri;
        System.out.println("Usted escogió la opción crear cuenta en Signal\n"
                + "Ingresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar el número de teléfono del Usuario: ");
        numeroTelefono = entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        paisUsuario = entrada.nextLine();
        System.out.println("Ingresar el hobby principal: ");
        hobbyPri = entrada.nextLine();
        System.out.printf("Resumen de cuenta creada en Signal\n"
                + "Nombre del usuario: %s\n"
                + "Número del teléfono del usuario: %s\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n"
                + "Hobby principal del usuario: %s\n",
                nombreUsuario, numeroTelefono, ciudadUsuario, paisUsuario,
                hobbyPri);
    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String ciudadUsuario;
        int edadUsuario;
        String correoUsuario;
        System.out.println("Usted escogió la opción crear cuenta en Instagram"
                + "\nIngresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edadUsuario = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correoUsuario = entrada.nextLine();
        System.out.printf("Resumen de cuenta creada en Instagram\n"
                + "Nombre del usuario: %s\n"
                + "Ciudad del usuario: %s\n"
                + "Edad del usuario: %d\n"
                + "Correo del usuario: %s\n",
                nombreUsuario, ciudadUsuario, edadUsuario, correoUsuario);
    }

    public static void crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String correoUsuario;
        System.out.println("Usted escogió la opción crear cuenta en Flickr\n"
                + "Ingresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correoUsuario = entrada.nextLine();
        System.out.printf("Resumen de cuenta creada en Flickr\n"
                + "Nombre del usuario: %s\n"
                + "Correo del usuario: %s\n",
                nombreUsuario, correoUsuario);
    }

    public static String obtenerMensaje(int cont) {
        String cadenaFinal = "";
        String[] mensajeFinal = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante", "Excelente campaña"};
        if ((cont >= 1) && (cont <= 5)) {
            cadenaFinal = mensajeFinal[0];
        } else {
            if ((cont >= 6) && (cont <= 15)) {
                cadenaFinal = mensajeFinal[1];
            } else {
                if (cont >= 16) {
                    cadenaFinal = mensajeFinal[2];
                }
            }
        }
        return cadenaFinal;
    }
}
