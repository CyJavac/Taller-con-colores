
package clase.pkg24.pkg03.pkg23;
public class Galleta {
    private String tamaño;
    private String color;
    private int gomitas;
    private int cantidad;
    
    public void mostrarGalletas() {
	System.out.print("es "+getTamaño()+", de color "+getColor()+", tiene "+getGomitas()+" gomitas, y hay "+getCantidad());
    }

    /**
     * @return the tamaño
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the gomitas
     */
    public int getGomitas() {
        return gomitas;
    }

    /**
     * @param gomitas the gomitas to set
     */
    public void setGomitas(int gomitas) {
        this.gomitas = gomitas;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
