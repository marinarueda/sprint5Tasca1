package model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk_SucursalID;
    private String nomSucursal;
    private String paisSucursal;

    public Sucursal() {
        this.pk_SucursalID = pk_SucursalID;
        this.nomSucursal = nomSucursal;
        this.paisSucursal = paisSucursal;
    }

    public Integer getPk_SucursalID() {
        return pk_SucursalID;
    }

    public void setPk_SucursalID(Integer pk_SucursalID) {
        this.pk_SucursalID = pk_SucursalID;
    }

    public String getNomSucursal() {
        return nomSucursal;
    }

    public void setNomSucursal(String nomSucursal) {
        this.nomSucursal = nomSucursal;
    }

    public String getPaisSucursal() {
        return paisSucursal;
    }

    public void setPaisSucursal(String paisSucursal) {
        this.paisSucursal = paisSucursal;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "pk_SucursalID=" + pk_SucursalID +
                ", nomSucursal='" + nomSucursal + '\'' +
                ", paisSucursal='" + paisSucursal + '\'' +
                '}';
    }

    public void setTipusSucursal(String tipusSucursal) {
    }

    public String getTipusSucursal() {
        return null;
    }
}
