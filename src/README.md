# Proyecto Pedidos-SOLID
Proyecto de refactorización aplicando principios SOLID para el procesamiento de pedidos.

## ✅ Principios SOLID aplicados
1. **SRP**: Cada clase tiene una sola responsabilidad.
2. **OCP**: Nuevos descuentos sin modificar el servicio principal.
3. **LSP**: Las clases de descuento son intercambiables.
4. **ISP**: Interfaces pequeñas y específicas.
5. **DIP**: Dependencia de abstracciones, no de implementaciones.

## 📂 Estructura
- `model/`: Entidades (`Pedido`)
- `discount/`: Reglas de descuento
- `notificacion/`: Avisos al cliente
- `repository/`: Acceso a datos
- `service/`: Lógica de negocio

## 🚀 Ejecución
Ejecutar `Main.java`. Se procesarán pedidos de cliente regular y VIP.

## 🔗 Repositorio
https://github.com/vivianacarolinapuertaramirez-ops/pedidos-solid