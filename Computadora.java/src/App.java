public class App {
    public static void main(String[] args) throws Exception {
       
        Computadora computadora = new Computadora();
        System.out.println("Marca: " + computadora.getMarca());
        computadora.setModelo("Victus 15");
        System.out.println("Modelo: " + computadora.getModelo());
        
        computadora.encender();
    
        
        computadora.encender();
        
        computadora.apagar(); 
}
}
