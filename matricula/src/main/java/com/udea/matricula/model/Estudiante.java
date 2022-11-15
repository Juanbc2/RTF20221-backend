package com.udea.matricula.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.ManyToAny;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ApiModel(description = "All details about the student. ")
@Entity
public class Estudiante implements Serializable {
    @ApiModelProperty(notes = "The database generated student ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idEstudiante")
    private Long idEstudiantes;

    //name
    @ApiModelProperty(notes = "Name")
    @Column(name = "nombre", nullable = false, length = 80)
    private @NonNull String name;

    //last name
    @ApiModelProperty(notes = "Last name")
    @Column(name = "apellido", nullable = false, length = 80)
    private @NonNull String lastaname;

    //email
    @ApiModelProperty(notes = "Email")
    @Column(name = "email", nullable = false, length = 80)
    private @NonNull String email;

    //date of birth
    @ApiModelProperty(notes = "Date of birth")
    @Column(name = "fechaNacimiento", nullable = false, length = 80)
    private String dateOfBirth;

    //date of registration
    @ApiModelProperty(notes = "Date of registration")
    @Column(name = "fechaMatricula", nullable = false, length = 80)
    private String dateOfRegistration;

    //id of the degree
    @ApiModelProperty(notes = "Id of the degree")
    @Column(name = "idGrado", nullable = false, length = 80)
    @ManyToOne(optional = false)
    private @NonNull Long idDegree;

    //guardian's last name
    @ApiModelProperty(notes = "guardian's  name")
    @Column(name = "bombreAcudiente", nullable = false, length = 80)
    private @NonNull String guardianName;

    //guardian's email
    @ApiModelProperty(notes = "guardian's email")
    @Column(name = "emailAcudiente", nullable = false, length = 80)
    private @NonNull String guardianEmail;

    //guardian's phone
    @ApiModelProperty(notes = "guardian's phone")
    @Column(name = "telefonoAcudiente", nullable = false, length = 80)
    private @NonNull String guardianPhone;

    //guardian's address
    @ApiModelProperty(notes = "guardian's address")
    @Column(name = "direccionAcudiente", nullable = false, length = 80)
    private @NonNull String guardianAddress;

    //guardian's relationship
    @ApiModelProperty(notes = "guardian's relationship")
    @Column(name = "parentescoAcudiente", nullable = false, length = 80)
    private @NonNull String guardianRelationship;

    //EPS
    @ApiModelProperty(notes = "EPS")
    @Column(name = "eps", nullable = false, length = 80)
    private @NonNull String eps;

    // socioeconomic strate
    @ApiModelProperty(notes = "socioeconomic strate")
    @Column(name = "estratoSocioeconomico", nullable = false, length = 80)
    private @NonNull String socioeconomicStrate;

}
