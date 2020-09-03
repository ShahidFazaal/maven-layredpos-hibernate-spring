package lk.ijse.dep.pos.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Customer")
public class Customer implements SuperEntity{
    @Id
    private String id;
    private String name;
    private String address;

}
