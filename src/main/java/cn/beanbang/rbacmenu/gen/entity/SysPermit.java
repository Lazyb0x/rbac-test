package cn.beanbang.rbacmenu.gen.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lazyb0x
 * @since 2020-07-27
 */
public class SysPermit extends Model<SysPermit> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String resourceId;

    private String name;

    private String desc;

    private Boolean isOpen;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysPermit{" +
        "id=" + id +
        ", resourceId=" + resourceId +
        ", name=" + name +
        ", desc=" + desc +
        ", isOpen=" + isOpen +
        "}";
    }
}
