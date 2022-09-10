import java.util.ArrayList;

public class Combo {
    public String nombre;
    public double precio;
    public ArrayList<Bebida> bebidas;
    public ArrayList<Acomp> acomps;
    public ArrayList<Postre> postres;

    public Combo(String nombre, double precio, ArrayList<Bebida> bebidas, ArrayList<Acomp> acomps,
            ArrayList<Postre> postres) {
        this.nombre = nombre;
        this.precio = precio;
        this.bebidas = bebidas;
        this.acomps = acomps;
        this.postres = postres;
    }    

    private static class ComboBuilder implements iBuilder<Combo>{
        private String nombre;
        private double precio;
        private ArrayList<Bebida> bebidas = new ArrayList<>();
        private ArrayList<Acomp> acomps = new ArrayList<>();
        private ArrayList<Postre> postres = new ArrayList<>();
        

        @Override
        public Combo build() {
            return new Combo(nombre, precio, bebidas, acomps, postres);
           
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
            bebidas.add(new Bebida(nombre, precio));
            return this;
        }


        public ComboBuilder setAcomps(String nombre, double precio) {
            acomps.add(new Acomp(nombre, precio));
            return this;
        }


        public ComboBuilder setPostres(String nombre, double precio) {
            postres.add(new Postre(nombre, precio));
            return this;
        }

    }

}