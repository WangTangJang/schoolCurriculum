package com.easybuy.pojo;
import java.util.Date;

/**
 * 商品分类
 */
public class EasyBuyProductCategory {
    private int id;
    private int parent_id;
    private String name;
    private int status;
    private int sort_order;
    private int is_parent;
    private Date created;

    private Date updated;

    public Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "EasyBuyProductCategory{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", sort_order=" + sort_order +
                ", is_parent=" + is_parent +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSort_order() {
        return sort_order;
    }

    public void setSort_order(int sort_order) {
        this.sort_order = sort_order;
    }

    public int getIs_parent() {
        return is_parent;
    }

    public void setIs_parent(int is_parent) {
        this.is_parent = is_parent;
    }
}
