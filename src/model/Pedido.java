package model;

public class Pedido {
    private String id;
    private double valorTotal;
    private String tipoCliente; // "REGULAR" o "VIP"

    public Pedido(String id, double valorTotal, String tipoCliente) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.tipoCliente = tipoCliente;
    }

    // Getters
    public String getId() {
        return id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
}
