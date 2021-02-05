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
        // - método principal - main
        Scanner entrada = new Scanner(System.in);
        int opcion1;
        String opcion2;
        int contadorCuentas = 1;
        boolean bandera = true;

        do {
            System.out.println("Ingresar 1 para crear una cuenta en Facebook\n"
                    + "Ingresar 2 para crear una cuenta de Twitter\n"
                    + "Ingresar 3 para crear una cuenta en Whatsapp\n"
                    + "Ingresar 4 para crear una cuenta en Telegram\n"
                    + "Ingresar 5 para crear una cuenta en Signal\n"
                    + "Ingresar 6 para crear una cuenta en Instagram\n"
                    + "Ingresar 7 para crear una cuenta en Flickr: ");
            opcion1 = entrada.nextInt();
            entrada.nextLine();
            /*
            - Si se ingresa 1 se llamará a crearFacebook
            - Si se ingresa 2 se llamará a crearTwitter
            - Si se ingresa 3 se llamará a crearWhatsapp
            - Si se ingresa 4 se llamará a crearTelegram
            - Si se ingresa 5 se llamará a crearSignal
            - Si se ingresa 6 se llamará a crearInstagram
            - Si se ingresa 7 se llamará a crearFlickr
            */
            switch (opcion1) {
                case 1:
                    System.out.println(crearFacebook());
                    break;
                case 2:
                    crearTwitter();
                    break;
                case 3:
                    System.out.println(crearWhatsapp());
                    break;
                case 4:
                    crearTelegram();
                    break;                
                case 5:
                    System.out.println(crearSignal());
                    break;
                case 6:
                    crearInstagram();
                    break;
                case 7:
                    System.out.println(crearFlickr());
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    contadorCuentas = contadorCuentas - 1;
                    break;
            }
            /*
                En cada iteración del ciclo; se pregunta al usuario si se 
                desea salir del ciclo.
            */
            System.out.println("Escriba SI para crear mas cuentas\n"
                    + "Escriba NO para ya no crear mas cuentas: ");
            opcion2 = entrada.nextLine();
            opcion2 = opcion2.toLowerCase();
            if (opcion2.equals("no")) {
                bandera = false;
                System.out.printf("%s\n", obtenerMensaje(contadorCuentas));
                /*
                    Cuando el usuario termina el ciclo repetitivo se 
                    debe presentar un mensaje con base al número total 
                    de cuentas creadas. Se debe usar el número total de 
                    cuentas como argumento (entero) de una función llamada 
                    obtenerMensaje
                */
            } else {
                contadorCuentas = contadorCuentas + 1;
            }
        } while (bandera);
    }

    public static String crearFacebook() {
        // - método crearFacebook - (método que devuelve un valor)
        /*
            - Facebook (se necesita los siguientes datos: nombre de 
            usuario, edad, ciudad, pais, correo electrónico)
        */
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        int edadUsuario;
        String ciudadUsuario;
        String paisUsuario;
        String correoUsuario;
        String cadena;
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
        cadena = String.format("Resumen de cuenta creada en Facebook\n"
                + "Nombre del usuario: %s\n"
                + "Edad del usuario: %s\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n"
                + "Correo del usuario: %s\n",
                nombreUsuario, edadUsuario, ciudadUsuario, paisUsuario,
                correoUsuario);
        return cadena;
    }

    public static void crearTwitter() {
        // - método crearTwitter - (método que no devuelve un valor)
        /*
            - Twitter (se necesita los siguientes datos: nombre de usuario, 
            nombres, apellidos, edad, ciudad, pais, idioma, 
            correo electrónico)
        */
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String nombres;
        String apellidos;
        int edadUsuario;
        String ciudadUsuario;
        String paisUsuario;
        String idiomaUsuario;
        String correoUsuario;
        System.out.println("Usted escogió la opción crear cuenta en Twitter\n"
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

    public static String crearWhatsapp() {
        // - método crearWhatsapp - - (método que devuelve un valor)
        /*
            - Whatsapp (se necesita los siguientes datos: 
            nombre de usuario, número de teléfono, edad, ciudad, pais)
        */
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String numeroTelefono;
        int edadUsuario;
        String ciudadUsuario;
        String paisUsuario;
        String cadena;
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
        cadena = String.format("Resumen de cuenta creada en Whatsapp\n"
                + "Nombre del usuario: %s\n"
                + "Número del teléfono del usuario: %s\n"
                + "Edad del usuario: %d\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n",
                nombreUsuario, numeroTelefono, edadUsuario, ciudadUsuario,
                paisUsuario);
        return cadena;
    }

    public static void crearTelegram() {
        // - método crearTelegram - (método que no devuelve un valor)
        /*
            - Telegram (se necesita los siguientes datos: 
            nombre de usuario, número de teléfono, ciudad, pais, 
            área de interés)
        */
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

    public static String crearSignal() {
        // - método crearSignal- (método que devuelve un valor)
        /*
            - Signal (se necesita los siguientes datos: 
            nombre de usuario, número de teléfono, ciudad, 
            pais, hobby principal)
        */
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String numeroTelefono;
        String ciudadUsuario;
        String paisUsuario;
        String hobbyPri;
        String cadena;
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
        cadena = String.format("Resumen de cuenta creada en Signal\n"
                + "Nombre del usuario: %s\n"
                + "Número del teléfono del usuario: %s\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n"
                + "Hobby principal del usuario: %s\n",
                nombreUsuario, numeroTelefono, ciudadUsuario, paisUsuario,
                hobbyPri);
        return cadena;
    }

    public static void crearInstagram() {
        // - método crearInstagram - (método que no devuelve un valor)
        /*
            - Instagram (se necesita los siguientes datos: 
            nombre de usuario, ciudad, edad, correo electrónico)
        */
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

    public static String crearFlickr() {
        // - método crearFlickr - (método que devuelve un valor)
        /*
            - Flickr (se necesita los siguientes datos: 
            nombre de usuario, correo electrónico)
        */
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String correoUsuario;
        String cadena;
        System.out.println("Usted escogió la opción crear cuenta en Flickr\n"
                + "Ingresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correoUsuario = entrada.nextLine();
        cadena = String.format("Resumen de cuenta creada en Flickr\n"
                + "Nombre del usuario: %s\n"
                + "Correo del usuario: %s\n",
                nombreUsuario, correoUsuario);
        return cadena;
    }

    public static String obtenerMensaje(int cont) {
        String cadenaFinal = "";
        String[] mensajeFinal = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante", "Excelente campaña"};
        /*
            a. Si el número de cuentas creadas está en el rango de 1 a 5 
            el mensaje será: Campaña con poca afluencia

            b. Si el número de cuentas creadas está en el rango de 6 a 15 
            el mensaje será: Campaña moderada siga adelante

            c. Si el número de cuentas creadas está en el rango de 16 
            en adelante, el mensaje será: Excelente campaña
        */
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
