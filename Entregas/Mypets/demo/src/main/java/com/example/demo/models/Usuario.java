package com.example.demo.models;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "colaboradores")
class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String password;
    private Date fechaNacimiento;
 @ManyToMany
    @JoinTable(
        name = "mascotas_usuarios",
        joinColumns = @JoinColumn(name = "usuario_id"),
        inverseJoinColumns = @JoinColumn(name = "mascota_id"))
    private List<Mascota> mascotas;
    @OneToMany(mappedBy = "usuario")
    private List<MeGustas> MeGusta;
}