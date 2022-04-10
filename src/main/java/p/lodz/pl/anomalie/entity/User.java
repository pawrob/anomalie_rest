package p.lodz.pl.anomalie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "user", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {


    private Long id;
    @Column(name = "login")
    private String login;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }


}
