package discount;

import model.pedidoDTO;

public class DescuentoClienteVip implements PoliticaDescuento {
    @Override
    public double aplicarDescuento(pedidoDTO pedidoDTO) {
        // 15% de descuento para clientes VIP
        return pedidoDTO.getValorTotal() * 0.85;
    }
}
