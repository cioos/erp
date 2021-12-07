package com.cisoos.erp.dao.vo;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/***
 * 本地表相当于总计表
 */
@Entity
@Data
@ToString
@Table(name = "platform_warehouse_product_local")
public class PWPLvo {
    @Id
    @Column(name = "pwpl_id")
    private Integer pwplId;
    @Column(name = "warehouse_id")
    private Integer warehouseId;
    @Column(name = "warehouse_name")
    private String warehouseName;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "FNSKU")
    private String fnsku;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "last_update_time")
    private java.sql.Timestamp lastUpdateTime;
    @Column(name = "available_qty")
    private Integer availableQty;
    @Column(name = "lock_qty")
    private Integer lockQty;
    @Column(name = "stock_qty")
    private Integer stockQty;
    @Column(name = "platform_sku")
    private String platformSku;
    @Column(name = "status")
    private Integer status;
    @Column(name = "dyn_prod_cost")
    private BigDecimal dynProdCost;
    @Column(name = "create_time")
    private java.sql.Timestamp createTime;
}
