package clase.pkg24.pkg03.pkg23;
public class PlatoGalletas {
    public static void main(String[] args) {
        int total;
        
        Galleta g1=new Galleta();
        g1.setTamaño("pequena");
        g1.setColor("cafe");
        g1.setGomitas(3);
        g1.setCantidad(4);
        
        Galleta g2=new Galleta();
        g2.setTamaño("mediana");
        g2.setColor("roja");
        g2.setGomitas(2);
        g2.setCantidad(g2.getCantidad() + 7);
        
        Galleta g3=new Galleta();
        g3.setTamaño("grande");
        g3.setColor("amarillo");
        g3.setGomitas(1);
        g3.setCantidad(g3.getCantidad() + 2);
        
        total= g1.getCantidad()+g2.getCantidad()+g3.getCantidad();
        
        System.out.print("La primera galleta ");
        g1.mostrarGalletas();
        
        System.out.println("");
        
        System.out.print("La primera galleta ");
        g2.mostrarGalletas();
        
        System.out.println("");
        
        System.out.print("La primera galleta ");
        g3.mostrarGalletas();
        
        System.out.println("");
        
        System.out.println("Cantidad de galletas en el plato: "+total);

    }
 
}
