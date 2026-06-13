package discount;

import model.pedidoDTO;

public class DescuentoClienteRegular implements PoliticaDescuento {
    @Override
    public double aplicarDescuento(pedidoDTO pedidoDTO) {
        // 5% de descuento para clientes regulares
        return pedidoDTO.getValorTotal() * 0.95;
    }
}