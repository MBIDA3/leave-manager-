package domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="t_employee")
public class Employee {
    @Id
    @Column(name="c_id")
    private Integer id;
    @Column(name="c_name")
    private String name;
    @Column(name="c_lastname")
    private String lastname;
    @Column(name="c_date_Of_Birth")
    private LocalDate dateOfBirth;
}
