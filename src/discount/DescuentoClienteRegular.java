package discount;

import model.Pedido;

public class DescuentoClienteRegular implements PoliticaDescuento {
    @Override
    public double aplicarDescuento(Pedido pedido) {
        // 5% de descuento para clientes regulares
        return pedido.getValorTotal() * 0.95;
    }
}