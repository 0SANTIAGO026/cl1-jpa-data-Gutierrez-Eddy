package pe.edu.I202112997.cl1_jpa_data_Gutierrez_Eddy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class countrylanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Language;

    @Enumerated(EnumType.STRING)
    @Column(name = "IsOfficial")
    private IsOfficial IsOfficial;

    private double Percentage;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="CountryCode")
    private Country CountryCode;
}
