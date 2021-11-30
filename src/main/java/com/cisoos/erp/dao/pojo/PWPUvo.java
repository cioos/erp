package com.cisoos.erp.dao.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@Table(name = "platform_warehouse_product_user")
public class PWPUvo {
    @Id
    @Column(name = "id")
    private Integer id;
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
    @Column(name = "ship_head_fee")
    private BigDecimal shipHeadFee;
    @Column(name = "charge_user_id")
    private Integer chargeUserId;
    @Column(name = "create_time")
    private java.sql.Timestamp createTime;

}
