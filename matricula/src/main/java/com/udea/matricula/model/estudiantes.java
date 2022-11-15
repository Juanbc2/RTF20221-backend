package com.udea.matricula.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class estudiantes implements Serializable {
    @ApiModelProperty(notes = "The database generated student ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idEstudiantes")
    private Long idEstudiantes;

    @ApiModelProperty(notes = "Nombre")
    @Column(name = "firstname", nullable = false, length = 80)
    private @NonNull String firstName;

    @ApiModelProperty(notes = "Apellido")
    @Column(name = "lastname", nullable = false, length = 80)
    private @NonNull String lastName;

    @ApiModelProperty(notes = "Documento")
    @Column(name="grade", nullable=false, length=20)
    private int grade; 

    @ApiModelProperty(notes = "Documento")
    @Column(name="pid", nullable=false, length=20)
    private int pid; 
    @ApiModelProperty(notes = "Dirección")
    @Column(name = "address", nullable = false, length = 80)
    private @NonNull String address;
    @ApiModelProperty(notes = "Fecha de nacimiento")
    @Column(name = "birthday", nullable = false, length = 30)
    private @NonNull Date birthday;

    @ApiModelProperty(notes = "Nombre del acudiente")
    @Column(name="nameacc", nullable=false, length=80)
    private @NonNull String nameacc;

    @ApiModelProperty(notes = "Documento del acudiente")
    @Column(name="pidacc", nullable=false, length=20)
    private int pidacc; 

    @ApiModelProperty(notes = "Correo del acudiente")
    @Column(name = "email", nullable = false, length = 80)
    private @NonNull String email;

    @ApiModelProperty(notes = "Teléfono")
    @Column(name = "telephone", nullable = false, length = 20)
    private int telephone;

    @ApiModelProperty(notes = "Teléfono alterno del acudiente")
    @Column(name = "alttelephone", nullable = false, length = 20)
    private int alttelephone;

    @ApiModelProperty(notes = "EPS")
    @Column(name = "eps", nullable = false, length = 20)
    private @NonNull String eps;

    @ApiModelProperty(notes = "Estrato")
    @Column(name = "estrato", nullable = false, length = 1)
    private int estrato;

}
