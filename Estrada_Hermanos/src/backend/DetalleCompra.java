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
@Table(name = "detalle_compra")
@NamedQueries({
    @NamedQuery(name = "DetalleCompra.findAll", query = "SELECT d FROM DetalleCompra d")})

public class DetalleCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_detalle_compra")
    private String idDetalleCompra;
    @Basic(optional = false)
    @Column(name = "cantidad_producto")
    private int cantidadProducto;
    @Basic(optional = false)
    @Column(name = "total_compra")
    private double totalCompra;
    @JoinColumn(name = "id_compra", referencedColumnName = "id_compra")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Compra idCompra;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto idProducto;

    public DetalleCompra() {
    }

    public DetalleCompra(String idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public DetalleCompra(String idDetalleCompra, int cantidadProducto, double totalCompra) {
        this.idDetalleCompra = idDetalleCompra;
        this.cantidadProducto = cantidadProducto;
        this.totalCompra = totalCompra;
    }

    public DetalleCompra(String idDetalleCompra, int cantidadProducto, double totalCompra, Compra idCompra, Producto idProducto) {
        this.idDetalleCompra = idDetalleCompra;
        this.cantidadProducto = cantidadProducto;
        this.totalCompra = totalCompra;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
    }
    
    

    public String getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(String idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleCompra != null ? idDetalleCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCompra)) {
            return false;
        }
        DetalleCompra other = (DetalleCompra) object;
        if ((this.idDetalleCompra == null && other.idDetalleCompra != null) || (this.idDetalleCompra != null && !this.idDetalleCompra.equals(other.idDetalleCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "generada.DetalleCompra[ idDetalleCompra=" + idDetalleCompra + " ]";
    }

}
