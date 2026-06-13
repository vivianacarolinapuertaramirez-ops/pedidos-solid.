package repository;

import model.Pedido;

public interface PedidosRepository {
    void guardar(Pedido pedido);
    Pedido buscarPorId(String id);
}