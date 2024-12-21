package com.elranchoabelito.mcproductos.models.dtos;

public class UpdateStockProductoDTO {

    private Integer idProducto;
    private Integer stock;

    public UpdateStockProductoDTO() {
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
