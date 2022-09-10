import java.util.ArrayList;

public class Combo implements iComboPrototype {
    public String nombre;
    public double precio;
    public ArrayList<PlatoFuerte> principal;
    public Bebida bebida;
    public Acomp acomp;
  

    public Combo(String nombre, double precio, Bebida bebida, Acomp acomp, ArrayList<PlatoFuerte> principal) {
        this.nombre = nombre;
        this.precio = precio;
        this.bebida = bebida;
        this.acomp = acomp;
        this.principal = principal;
        
    }    

    @Override
    public iComboPrototype clone() {
        Combo clone = new Combo(nombre, precio, bebida, acomp, principal);
        return clone;
    }

    @Override
    public iComboPrototype deepClone() {
        return clone();
    }

    private static class ComboBuilder implements iBuilder<Combo>{
        private String nombre;
        private double precio;
        private Bebida bebida;
        private Acomp acomp;
        private ArrayList<PlatoFuerte> principal;
        
        

        @Override
        public Combo build() {
            return new Combo(nombre, precio, bebida, acomp, principal);
           
        }


        public ComboBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }


        public ComboBuilder setPrecio(double precio) {
            this.precio = precio;
            return this;
        }


        public ComboBuilder setBebidas(String nombre, double precio) {
            this.bebida = new Bebida(nombre,precio);
            return this;
        }


        public ComboBuilder setAcomp(String nombre, double precio) {
            this.acomp = new Acomp(nombre,precio);
            return this;
        }

        public ComboBuilder setPrincipal(ArrayList<PlatoFuerte> principal) {
            this.principal = principal;
            return this;
        }


        

    }

   

}