package cn.gson.boot02106.model.pojos;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * role
 * @author 
 */
@Data
public class Role implements Serializable {
    private Integer rId;

    private String rName;

    private Date rDate;

    /**
     * 部门id
     */
    private Integer dId;

    private static final long serialVersionUID = 1L;
}