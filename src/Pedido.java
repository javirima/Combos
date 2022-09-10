import java.util.ArrayList;

public class Pedido {
    public String cliente;
    public double precio;
    public iComboPrototype combo;
    public ArrayList<Alimento> extras;

    public Pedido(String cliente, double precio, iComboPrototype combo, ArrayList<Alimento> extras) {
        this.cliente = cliente;
        this.precio = precio;
        this.combo = combo;
        this.extras = extras;
    }

    private static class PedidoBuilder implements iBuilder<Pedido>{
        private String cliente;
        private double precio;
        private iComboPrototype combo;
        private ArrayList<Alimento> extras;

        @Override
        public Pedido build() {
            
            return new Pedido(cliente,precio,combo,extras);
        }

        public PedidoBuilder setCliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        public PedidoBuilder setPrecio(double precio) {
            this.precio = precio;
            return this;
        }

        public PedidoBuilder setCombo(iComboPrototype combo) {
            this.combo = combo;
            return this;
        }

        public PedidoBuilder addExtras(Alimento alimento) {
            extras.add(alimento);
            return this;
        }


    }


    
    
}
