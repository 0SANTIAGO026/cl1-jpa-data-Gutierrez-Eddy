package pe.edu.I202112997.cl1_jpa_data_Gutierrez_Eddy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class city {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String District;
    private int Population;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="CountryCode")
    private Country CountryCode;
}
