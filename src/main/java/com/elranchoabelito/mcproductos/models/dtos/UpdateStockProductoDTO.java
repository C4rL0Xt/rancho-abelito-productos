package com.elranchoabelito.mcproductos.models.dtos;

public class UpdateStockProductoDTO {

    private Integer idProducto;
    private Integer cantidadM;

    public UpdateStockProductoDTO() {
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidadM() {
        return cantidadM;
    }

    public void setCantidadM(Integer stock) {
        this.cantidadM = stock;
    }
}
