package backend;

import java.io.Serializable;
import java.util.Date;

public class PagoCompra implements Serializable {
    
   private Compra compra;
   private Double monto_pago;
   private Date fecha_pago;
   
    public PagoCompra(Compra compra, Double monto_pago, Date fecha_pago) {
        this.compra = compra;
        this.monto_pago = monto_pago;
        this.fecha_pago = fecha_pago;
    }

    public Compra getCompra() {
        return compra;
    }

    public Double getMonto_pago() {
        return monto_pago;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void setMonto_pago(Double monto_pago) {
        this.monto_pago = monto_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }
   
   
    
}
