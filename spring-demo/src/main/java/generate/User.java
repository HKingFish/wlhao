package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * role
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer id;

    private static final long serialVersionUID = 1L;
}