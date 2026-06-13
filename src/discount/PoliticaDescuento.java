package discount;

import model.pedidoDTO;

public interface PoliticaDescuento {
    double aplicarDescuento(pedidoDTO pedidoDTO);
}
