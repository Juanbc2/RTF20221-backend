package com.udea.matricula.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
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
@ApiModel(description = "All details about the grado.")
@Entity

public class Grado implements Serializable {
  @ApiModelProperty(notes = "The database generated grado ID")
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idGrado")
  private Long idGrado;

  // nombre de grado
  @ApiModelProperty(notes = "Grado")
  @Column(name = "grade", nullable = false, length = 80)
  private @NonNull String grade;

  // cupos de grado
  @ApiModelProperty(notes = "Cupos")
  @Column(name = "cupos", nullable = false, length = 80)
  private @NonNull int cupos;

  // ocupacion
  @ApiModelProperty(notes = "Ocupacion")
  @Column(name = "ocupacion", nullable = false, length = 80)
  private @NonNull int ocupacion;



}
