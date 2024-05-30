package Model;
public class Zapato {
    private int talla;
    private String color;
    
    public Zapato(){
        
    }
    public Zapato(int talla, String color) {
        this.talla = talla;
        this.color = color;
    }
    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
