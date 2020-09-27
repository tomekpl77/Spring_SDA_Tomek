package pl.sda.hellospring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CARS")
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "marka_samochodu", nullable = false)
    private String brand;
    @Column(name = "model_samochodu")
    private String model;

    //@Transient
    @Column(name = "kolor_samochodu")
    private String color;


}
