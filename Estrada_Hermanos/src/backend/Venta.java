package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "venta")
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_venta")
    private String idVenta;
    @Basic(optional = false)
    @Column(name = "fecha_venta")
    @Temporal(TemporalType.DATE)
    private Date fechaVenta;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente idCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVenta", fetch = FetchType.LAZY)
    private ArrayList<DetalleVenta> detalleVentaList;
    private Double total_venta;

    public Venta() {
    }

    public Venta(String idVenta) {
        this.idVenta = idVenta;
    }

    public Venta(String idVenta, Date fechaVenta) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
    }

    public Venta(String idVenta, Date fechaVenta, Cliente idCliente, ArrayList<DetalleVenta> detalleVentaList) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.idCliente = idCliente;
        this.detalleVentaList = detalleVentaList;

    }

    public Venta(String idVenta, Date fechaVenta, Cliente idCliente, Double total_venta) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.idCliente = idCliente;
        this.total_venta = total_venta;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public List<DetalleVenta> getDetalleVentaList() {
        return detalleVentaList;
    }

    public void setDetalleVentaList(ArrayList<DetalleVenta> detalleVentaList) {
        this.detalleVentaList = detalleVentaList;
    }

    public Double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(Double total_venta) {
        this.total_venta = total_venta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    public void ingresarDetalleVenta(DetalleVenta detalleVenta) {
        detalleVentaList.add(detalleVenta);
    }

    @Override
    public String toString() {
        return "generada.Venta[ idVenta=" + idVenta + " ]";
    }

}
