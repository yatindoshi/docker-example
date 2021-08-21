package doshi.yatin.dockerexample.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Docker {
    @Id
    private int id;

    private String name;
}
