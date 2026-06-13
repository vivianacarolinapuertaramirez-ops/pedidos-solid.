import discount.DescuentoClienteRegular;
import discount.DescuentoClienteVip;
import discount.PoliticaDescuento;
import model.Pedido;
import notificacion.NotificadorPedido;
import notificacion.NotificadorPedidoImpl;
import repository.PedidosRepository;
import repository.PedidosRepositoryImpl;
import service.ProcesarPedidoService;
import service.ProcesarPedidoUseCase;

public class Main {
    public static void main(String[] args) {
        // 1. Preparar dependencias
        PedidosRepository repositorio = new PedidosRepositoryImpl();
        NotificadorPedido notificador = new NotificadorPedidoImpl();

        // 2. CASO 1: Cliente REGULAR
        PoliticaDescuento descuentoRegular = new DescuentoClienteRegular();
        ProcesarPedidoUseCase servicioRegular = new ProcesarPedidoService(descuentoRegular, repositorio, notificador);
        Pedido pedido1 = new Pedido("PED-001", 1000.0, "REGULAR");
        servicioRegular.ejecutar(pedido1);

        // 3. CASO 2: Cliente VIP
        PoliticaDescuento descuentoVip = new DescuentoClienteVip();
        ProcesarPedidoUseCase servicioVip = new ProcesarPedidoService(descuentoVip, repositorio, notificador);
        Pedido pedido2 = new Pedido("PED-002", 1000.0, "VIP");
        servicioVip.ejecutar(pedido2);
    }
}