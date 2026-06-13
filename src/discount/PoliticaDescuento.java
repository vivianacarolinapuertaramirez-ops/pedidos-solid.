package discount;

import model.Pedido;

public interface PoliticaDescuento {
    double aplicarDescuento(Pedido pedido);
}
