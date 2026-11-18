package tiendaelectronica.modelo;

public class Dispositivo {
    private int codigo;
    private String marca;
    private boolean estado;

    public Dispositivo(int codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
        estado = false;
    }

    public String prender(){
        if (estado == false){
            estado = true;
            return "Prendido";
        }
        return "El dispositivo ya se encontraba prendido";
    }

    public String apagar(){
        if (estado){
            estado = false;
            return "Apagado";
        }
        return "El dispositivo no estaba prendido";
    }

    public String mostrarInformacion(){
        String estadoS = estado? "Prendido":"Apagado";
        return "Codigo: "+codigo+"\nMarca: "+marca+"\nEstado: " +estadoS;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getMarca() {
        return marca;
    }

    public int getCodigo() {
        return codigo;
    }
}