package clase.pkg24.pkg03.pkg23;
public class PlatoGalletas {
    public static void main(String[] args) {
        int total;
        
        Galleta g1=new Galleta();
        g1.tamaño="pequena";
        g1.color="cafe";
        g1.gomitas=3;
        g1.cantidad=4;
        
        Galleta g2=new Galleta();
        g2.tamaño="mediana";
        g2.color="roja";
        g2.gomitas=2;
        g2.cantidad+=7;
        
        Galleta g3=new Galleta();
        g3.tamaño="grande";
        g3.color="amarillo";
        g3.gomitas=1;
        g3.cantidad+=2;
        
        total= g1.cantidad+g2.cantidad+g3.cantidad;
        
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
