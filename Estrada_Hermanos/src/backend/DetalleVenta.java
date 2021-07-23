package backend;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_venta")
@NamedQueries({
    @NamedQuery(name = "DetalleVenta.findAll", query = "SELECT d FROM DetalleVenta d")})
public class DetalleVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_detalle_venta")
    private String idDetalleVenta;
    @Basic(optional = false)
    @Column(name = "cantidad_producto")
    private int cantidadProducto;
    @Basic(optional = false)
    @Column(name = "total_venta")
    private double totalVenta;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto idProducto;
    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Venta idVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(String idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public DetalleVenta(String idDetalleVenta, int cantidadProducto, double totalVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidadProducto = cantidadProducto;
        this.totalVenta = totalVenta;
    }

    public DetalleVenta(String idDetalleVenta, Producto idProducto, int cantidadProducto, Venta idVenta, double totalVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidadProducto = cantidadProducto;
        this.totalVenta = totalVenta;
        this.idProducto = idProducto;
        this.idVenta = idVenta;
    }

    public String getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(String idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleVenta != null ? idDetalleVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVenta)) {
            return false;
        }
        DetalleVenta other = (DetalleVenta) object;
        if ((this.idDetalleVenta == null && other.idDetalleVenta != null) || (this.idDetalleVenta != null && !this.idDetalleVenta.equals(other.idDetalleVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "generada.DetalleVenta[ idDetalleVenta=" + idDetalleVenta + " ]";
    }

}
