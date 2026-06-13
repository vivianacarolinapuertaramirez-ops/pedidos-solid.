package discount;

import model.Pedido;

public class DescuentoClienteVip implements PoliticaDescuento {
    @Override
    public double aplicarDescuento(Pedido pedido) {
        // 15% de descuento para clientes VIP
        return pedido.getValorTotal() * 0.85;
    }
}
