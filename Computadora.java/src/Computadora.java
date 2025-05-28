public class Computadora {
    
    private String marca;
    private String modelo;
    private boolean encendida;

    public Computadora(){}

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Encenediendo....");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    public void apagar(){
        if(encendida){
            encendida = false;
            System.out.println("Apagando....");
        } else {    
        
            System.out.println("la computadora ya esta apagada");}
    }


}
