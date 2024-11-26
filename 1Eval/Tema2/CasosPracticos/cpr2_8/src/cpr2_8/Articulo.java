package cpr2_8;

public class Articulo {
    // controlar precio de un articulo
    // por defecto es 0€ pero luego se puede establecer el precio inicial para el
    // articulo corespondiente
    // al usuario cuando tenga que hacer la gestion preguntar si quiere cambiar el
    // precio del producto
    // metodo descuento al cual hay que pasarle la cantidad de desceunto que le
    // queremos hacer (pasar en %)
    // si el precio supera los 200€ se le aplica ese descuento y en caso contrario
    // no

    // atributos
    private double precio, pInicial;

    // constructores
    public Articulo() {
        this.precio = 0;
    }

    public Articulo(double precio) {
        this.precio = precio;
    }

    // getters y setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getpInicial() {
        return pInicial;
    }

    public void setpInicial(double pInicial) {
        this.pInicial = pInicial;
    }

    // metodos
    public double descuento(double descuento) {
        if (this.precio > 200)
            return this.precio - this.precio * (descuento / 100);
        else
            return this.precio;
    }
}
