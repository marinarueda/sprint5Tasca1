package model.dto;

public class SucursalDTO {
    private Integer pk_SucursalID;
    private String nomSucursal;
    private String paisSucursal;
    private String tipusSucursal;

    SucursalDTO sucursal1 = new SucursalDTO(1, "Sucursal norte", "España", "EU");
    SucursalDTO sucursal2 = new SucursalDTO(2, "Sucursal sur", "España", "Fora EU");

    public SucursalDTO(int pk_SucursalID, String nomSucursal, String paisSucursal, String tipusSucursal) {
        this.pk_SucursalID = pk_SucursalID;
        this.nomSucursal = nomSucursal;
        this.paisSucursal = paisSucursal;
        this.tipusSucursal = tipusSucursal;
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

    public String getTipusSucursal() {
        return tipusSucursal;
    }

    public void setTipusSucursal(String tipusSucursal) {
        this.tipusSucursal = tipusSucursal;
    }

    @Override
    public String toString() {
        return "SucursalDTO{" +
                "pk_SucursalID=" + pk_SucursalID +
                ", nomSucursal='" + nomSucursal + '\'' +
                ", paisSucursal='" + paisSucursal + '\'' +
                ", tipusSucursal='" + tipusSucursal + '\'' +
                '}';
    }
}
