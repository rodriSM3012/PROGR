public class Vehiculo {
    // atributos
    String marca, modelo, placa;

    // contructores
    public Vehiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    // getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // metodos
    public void mostrarDetalles() {
        System.out.printf("Marca: %s\nModelo: %s\nPlaca: %s\n", this.marca, this.modelo, this.placa);
    }

    
}
