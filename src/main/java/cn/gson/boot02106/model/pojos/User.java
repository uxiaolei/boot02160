package cn.gson.boot02106.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer uid;

    private String uname;

    private static final long serialVersionUID = 1L;
}