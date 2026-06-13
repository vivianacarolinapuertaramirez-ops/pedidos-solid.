package model;

public class pedidoDTO {
    private String id;
    private double valorTotal;
    private String tipoCliente; // "REGULAR" o "VIP"

    public pedidoDTO(String id, double valorTotal, String tipoCliente) {
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
