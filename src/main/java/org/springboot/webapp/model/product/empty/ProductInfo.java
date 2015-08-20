package org.springboot.webapp.model.product.empty;

import java.io.Serializable;

/**
 * Created with IDEA.
 * User: zhoudianyou
 */
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 7467050235493132990L;

    private Long id;
    private String productName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                '}';
    }
}
