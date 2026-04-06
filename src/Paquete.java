import java.util.Objects;

public class Paquete {
    private String codigo;
    private double peso;
    private String destino;

    public Paquete(String codigo, double peso, String destino) {
        this.codigo = codigo;
        this.peso = peso;
        this.destino = destino;
    }
    // Getters
    public String getCodigo() { return codigo; }
    public double getPeso() { return peso; }
    public String getDestino() { return destino; }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paquete paquete = (Paquete) o;
        return Objects.equals(codigo, paquete.codigo);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    // Metodo
    @Override
    public String toString() {
        return "Paquete [Código=" + codigo + ", Peso=" + peso + "kg, Destino=" + destino + "]";
    }
}