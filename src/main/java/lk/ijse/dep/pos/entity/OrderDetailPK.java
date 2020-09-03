package lk.ijse.dep.pos.entity;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class OrderDetailPK implements Serializable {

    private String orderId;

    private String itemCode;

}
