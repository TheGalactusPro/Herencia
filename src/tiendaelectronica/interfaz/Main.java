package tiendaelectronica.interfaz;

import tiendaelectronica.modelo.CamaraSeguridad;
import tiendaelectronica.modelo.Computador;

public class Main {
    static void main() {
        Computador c1 = new Computador(1,"HP",32);
        CamaraSeguridad cs1 = new CamaraSeguridad(1,"CCTV",1028);

        System.out.println(c1.prender());
        if(c1.ejecutarPrograma("Word")){
            System.out.println("El prograjma ha sido lanzado");
        }else{
            System.out.println("No se ha podido ejectuar el programa");
        }

        System.out.println(c1.apagar());
        System.out.println(c1.apagar());
        System.out.println(c1.mostrarInformacion());

        System.out.println(cs1.apagar());
        if (cs1.grabarVideo()){
            System.out.println("\nEl video se ha grabado y guardado con exito");
        }else{
            System.out.println("El video no pudo grabarse");
        }

        System.out.println(cs1.prender());
        System.out.println(cs1.prender());
        System.out.println(cs1.mostrarInformacion());
    }
}