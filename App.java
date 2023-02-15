package com.herencia03;
import java.util.Scanner;
/**
 * TODO: Enviar un mensaje de Whatsapp
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        
        //! Pruebas de texto

        //System.out.println("Mensaje 1");
        //MensajeTexto mAlberto = new MensajeTexto("Alberto Mendez", "2291613333", "Soy su alumno Cristopher Eduardo Ascencio Cruz");
        //mAlberto.enviarMensaje();
        
        // System.out.println("Mensaje 2");
        // MensajeTexto mJoyce = new MensajeTexto("Joyce Tahily", "2291475113", "Hola Joyce:)");
        // mJoyce.enviarMensaje();
    
        //!Pruebas de audio

        // MensajeVoz mPrueba = new MensajeVoz("Joyce", "2291475113", "prueba2", "3");
        // mPrueba.enviarAudio();

        // MensajeTexto tAlberto = new MensajeTexto("Alberto", "2291613333", "Prueba de audio:\nPor Cristopher Ascencio");
        // tAlberto.enviarMensaje();
        // MensajeVoz mAlberto = new MensajeVoz("Alberto Mendez", "2291613333", "prueba01", "2");
        // mAlberto.enviarAudio();

        MensajeVoz mPrueba2 = new MensajeVoz("Cristopher", "2297806951", "Hola", "3");
        mPrueba2.grabarAudio();
        mPrueba2.enviarAudio();

        //! Menu de opciones en construccion
        // int opcion = 0;
        // String dest, numTel, msj, nomAudio, durAudio;
        // System.out.println("Menu:\n1.Enviar Mensaje de Texto.\n2.Enviar mensaje de voz.");
        // System.out.print("Ingrese su opcion:");
        // opcion = in.nextInt();
        // switch (opcion) {
        //     case 1:
        //         System.out.println("Ingrese el destinatario: ");
        //         dest = in.nextLine();
        //         System.out.println("Ingres el numero de telefono: ");
        //         numTel = in.nextLine();
        //         System.out.println("Ingrese el mensaje a enviar: ");
        //         msj = in.nextLine();
        //         MensajeTexto mTexto = new MensajeTexto(dest, numTel, msj);
        //         mTexto.enviarMensaje();
        //         break;
        //     case 2:
        //         System.out.println("Ingrese el destinatario: ");
        //         dest = in.nextLine();
        //         System.out.println("Ingres el numero de telefono: ");
        //         numTel = in.nextLine();
        //         System.out.println("Ingrese nombre que tendra el archivo: ");
        //         nomAudio = in.nextLine();
        //         System.out.println("Ingres la duracion del audio: ");
        //         durAudio = in.nextLine();
        //         MensajeVoz mVoz = new MensajeVoz(dest, numTel, nomAudio, durAudio);
        //         mVoz.grabarAudio();
        //         mVoz.enviarAudio();
        //         break;
        //     default:
        //     System.out.println("Ingrese una opcion Valida!");
        //         break;
        // }
        in.close();
    }
}
