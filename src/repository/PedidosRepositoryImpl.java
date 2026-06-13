package repository;

import model.Pedido;
import java.util.HashMap;
import java.util.Map;

public class PedidosRepositoryImpl implements PedidosRepository {
    private final Map<String, Pedido> baseDatos = new HashMap<>();

    @Override
    public void guardar(Pedido pedido) {
        baseDatos.put(pedido.getId(), pedido);
        System.out.println("💾 Pedido guardado en repositorio: " + pedido.getId());
    }

    @Override
    public Pedido buscarPorId(String id) {
        return baseDatos.get(id);
    }
}