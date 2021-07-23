package backend;

import excepciones.ZapateriaExcepciones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repositorio.ClienteRepositorio;
import repositorio.CompraRepositorio;
import repositorio.DetalleCompraRepositorio;
import repositorio.DetalleVentaRepositorio;
import repositorio.PagoCompraRepositorio;
import repositorio.ProductoRepositorio;
import repositorio.ProveedorRepositorio;
import repositorio.TipoProductoRepositorio;
import repositorio.VentaRepositorio;

public class Zapateria {

    private Cliente cliente;
    private Proveedor proveedor;
    private Venta venta;
    private Compra compra;
    private DetalleVenta detalle_venta;
    private DetalleCompra detalle_compra;
    private Producto producto;
    private TipoProducto tipo_producto;
    private PreparedStatement ps;
    private ResultSet rs;

    public Zapateria() {

    }

    //AQUI VAN TODAS LAS ACCIONES DE UN CLIENTE
    /**
     * Agregamos un cliente, si nos da mayor que 0 se agregó, sino no se ha
     * agregado
     *
     * @param cliente
     * @return
     * @throws Exception
     */
    public Boolean agregarCliente(Cliente cliente) throws Exception {
        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        return clienteRepositorio.save(cliente) != null;
    }

    public Cliente consultarCliente(String idCliente) throws Exception {
        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        return clienteRepositorio.find(idCliente);
    }

    public Boolean modificarCliente(Cliente cliente, String id_cliente) throws Exception {

        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        return clienteRepositorio.update(cliente) != null;

    }

    public Boolean eliminarCliente(String idCliente) {

        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        return clienteRepositorio.delete(idCliente);

    }

    public String[][] consultarClientes() {

        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        ArrayList<Cliente> clientes = clienteRepositorio.consultarClientes();
        String[][] datos = new String[clientes.size()][5];

        for (int i = 0; i < clientes.size(); i++) {
            datos[i][0] = clientes.get(i).getIdCliente();
            datos[i][1] = clientes.get(i).getNombre();
            datos[i][2] = clientes.get(i).getApellido();
            datos[i][3] = String.valueOf(clientes.get(i).getTelefono());
            datos[i][4] = clientes.get(i).getEmail();
        }

        return datos;
    }

    //AQUÍ VAN TODAS LAS ACCIONES DE UN PROVEEDOR
    public Boolean agregarProveedor(Proveedor proveedor) throws ZapateriaExcepciones {
        try {
            ProveedorRepositorio proveedorRepositorio = new ProveedorRepositorio();
            return proveedorRepositorio.save(proveedor) != null;
        } catch (NumberFormatException nfe) {
            throw new ZapateriaExcepciones("Datos mal ingresados, revise los campos");
        }

    }

    public Proveedor consultarProveedor(String id_proveedor) {
        ProveedorRepositorio proveedorRepositorio = new ProveedorRepositorio();
        return proveedorRepositorio.find(id_proveedor);
    }

    public String[][] consultarProveedores() {
        ProveedorRepositorio proveedorRepositorio = new ProveedorRepositorio();
        ArrayList<Proveedor> proveedores = proveedorRepositorio.consultarProveedores();
        String[][] datos = new String[proveedores.size()][6];

        for (int i = 0; i < proveedores.size(); i++) {
            datos[i][0] = proveedores.get(i).getIdProveedor();
            datos[i][1] = proveedores.get(i).getNombre();
            datos[i][2] = proveedores.get(i).getApellido();
            datos[i][3] = proveedores.get(i).getDireccion();
            datos[i][4] = String.valueOf(proveedores.get(i).getTelefono());
            datos[i][5] = proveedores.get(i).getEmail();
        }
        return datos;
    }

    public Boolean modificarProveedor(Proveedor proveedor) {
        ProveedorRepositorio proveedorRepositorio = new ProveedorRepositorio();
        return proveedorRepositorio.update(proveedor) != null;
    }

    public Boolean eliminarProveedor(String id_proveedor) {
        ProveedorRepositorio proveedorRepositorio = new ProveedorRepositorio();
        return proveedorRepositorio.delete(id_proveedor);

    }

    //AQUÍ VAN TODAS LAS ACCIONES DE UNA VENTA
    public Boolean ingresarVenta(Venta venta) {
        VentaRepositorio ventaRepositorio = new VentaRepositorio();
        return ventaRepositorio.save(venta) != null;
    }

    public Venta consultarVenta(String id_venta) {
        VentaRepositorio ventaRepositorio = new VentaRepositorio();
        return ventaRepositorio.find(id_venta);
    }

    public Boolean agregarTotalVenta(Venta venta, Double totalVenta) {
        VentaRepositorio ventaRepositorio = new VentaRepositorio();
        return ventaRepositorio.agregarTotalVenta(venta, totalVenta) != null;
    }

    // AQUÍ VAN TODAS LAS ACCIONES DE UN DETALLE VENTA
    public Boolean ingresarDetalleVenta(DetalleVenta detalleVenta) {
        DetalleVentaRepositorio detalleVentaRepositorio = new DetalleVentaRepositorio();
        return detalleVentaRepositorio.save(detalleVenta) != null;
    }

    public String[][] consultarDetallesVenta(String id_venta) {
        DetalleVentaRepositorio detalleVentaRepositorio = new DetalleVentaRepositorio();
        DetalleVenta[] detalleVentas = detalleVentaRepositorio.consultarDetallesVenta(id_venta);
        String[][] datos = new String[detalleVentas.length][5];

        for (int i = 0; i < datos.length; i++) {
            datos[i][0] = detalleVentas[i].getIdDetalleVenta();
            datos[i][1] = detalleVentas[i].getIdVenta().getIdVenta();
            datos[i][2] = detalleVentas[i].getIdProducto().getIdProducto();
            datos[i][3] = String.valueOf(detalleVentas[i].getCantidadProducto());
            datos[i][4] = String.valueOf(detalleVentas[i].getTotalVenta());
        }

        return datos;

    }

    // AQUÍ VAN LAS ACCIONES DE UN  TIPO_PRODUCTO
    public Boolean ingresarTipoProducto(TipoProducto tipoProducto) {
        TipoProductoRepositorio tipoProductoRepositorio = new TipoProductoRepositorio();
        return tipoProductoRepositorio.save(tipoProducto) != null;
    }

    public TipoProducto consultarTipoProducto(String nombre) {
        TipoProductoRepositorio tipoProductoRepositorio = new TipoProductoRepositorio();
        return tipoProductoRepositorio.find(nombre);
    }

    // AQUÍ VAN LAS ACCIONES DE PRODUCTO
    public Boolean ingresarProducto(Producto producto) {
        ProductoRepositorio productoRepositorio = new ProductoRepositorio();
        return productoRepositorio.save(producto) != null;
    }

    public Producto consultarProducto(String id_producto) {
        ProductoRepositorio productoRepositorio = new ProductoRepositorio();
        return productoRepositorio.find(id_producto);
    }

    public Boolean modificarProducto(Producto producto) {
        ProductoRepositorio productoRepositorio = new ProductoRepositorio();
        return productoRepositorio.update(producto) != null;
    }

    public Boolean eliminarProducto(String idProducto) {
        ProductoRepositorio productoRepositorio = new ProductoRepositorio();
        return productoRepositorio.delete(idProducto);
    }

    // AQUI TODO SOBRE UNA  C O M P R A
    public Boolean agregarCompra(Compra compra) {
        CompraRepositorio compraRepositorio = new CompraRepositorio();
        return compraRepositorio.save(compra) != null;
    }

    public Compra consultarCompra(String id_compra) {
        CompraRepositorio compraRepositorio = new CompraRepositorio();
        return compraRepositorio.find(id_compra);
    }

    public Boolean agregarTotalCompra(Compra compra, Double totalCompra) {
        CompraRepositorio compraRepositorio = new CompraRepositorio();
        return compraRepositorio.agregaTotalCompra(compra, totalCompra) != null;

    }

    public String[][] consultarCompras() throws Exception {
        CompraRepositorio compraRepositorio = new CompraRepositorio();
        ArrayList<Compra> compras = compraRepositorio.consultarCompras(this);

        String[][] datos = new String[compras.size()][4];
        for (int i = 0; i < compras.size(); i++) {
            datos[i][0] = compras.get(i).getIdCompra();
            datos[i][1] = compras.get(i).getIdProveedor().getIdProveedor();
            datos[i][2] = String.valueOf(compras.get(i).getFechaCompra());
            datos[i][3] = String.valueOf(compras.get(i).getTotal_compra());
        }
        return datos;
    }

    // AQUI VA TODO SOBRE UN   D E T A L L E    C O M P R A
    public Boolean agregarDetalleCompra(DetalleCompra detalleCompra) {
        DetalleCompraRepositorio detalleCompraRepositorio = new DetalleCompraRepositorio();
        return detalleCompraRepositorio.save(detalleCompra) != null;
    }

    public String[][] consultarDetallesCompra(String id_compra) {
        DetalleCompraRepositorio detalleCompraRepositorio = new DetalleCompraRepositorio();
        ArrayList<DetalleCompra> registros = detalleCompraRepositorio.consultarDetallesCompra(id_compra);
        String[][] datos = new String[registros.size()][5];
        for (int i = 0; i < registros.size(); i++) {
            datos[i][0] = registros.get(i).getIdDetalleCompra();
            datos[i][1] = registros.get(i).getIdCompra().getIdCompra();
            datos[i][2] = registros.get(i).getIdProducto().getIdProducto();
            datos[i][3] = String.valueOf(registros.get(i).getCantidadProducto());
            datos[i][4] = String.valueOf(registros.get(i).getTotalCompra());
        }
        return datos;
    }

    public String[][] consultarDetalleCompra(String id_detalle_compra) {
        String[][] datos = new String[1][5];
        DetalleCompraRepositorio detalleCompraRepositorio = new DetalleCompraRepositorio();
        datos[0][0] = detalleCompraRepositorio.find(id_detalle_compra).getIdDetalleCompra();
        datos[0][1] = detalleCompraRepositorio.find(id_detalle_compra).getIdCompra().getIdCompra();
        datos[0][2] = detalleCompraRepositorio.find(id_detalle_compra).getIdProducto().getIdProducto();
        datos[0][3] = String.valueOf(detalleCompraRepositorio.find(id_detalle_compra).getCantidadProducto());
        datos[0][4] = String.valueOf(detalleCompraRepositorio.find(id_detalle_compra).getTotalCompra());
        return datos;
    }

    public DetalleCompra modificarDetalleCompra(DetalleCompra detalleCompra) {
        DetalleCompraRepositorio detalleCompraRepositorio = new DetalleCompraRepositorio();
        return detalleCompraRepositorio.update(detalleCompra);
    }

    public Boolean eliminarDetalleCompra(String idDetalleCompra) {
        DetalleCompraRepositorio detalleCompraRepositorio = new DetalleCompraRepositorio();
        return detalleCompraRepositorio.delete(idDetalleCompra);
    }

    // AQUI VA TODO SOBRE P A G O ___ C O M P R A
    public Boolean agregarPagoCompra(PagoCompra pagoCompra) {
        PagoCompraRepositorio pagoCompraRepositorio = new PagoCompraRepositorio();
        return pagoCompraRepositorio.save(pagoCompra) != null;
    }

}
