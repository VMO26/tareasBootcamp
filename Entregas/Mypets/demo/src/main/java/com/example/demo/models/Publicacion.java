package com.example.demo.models;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "publicaciones")
class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String asunto;
    private String contenido;
    @CreationTimestamp
    @Column(name="fecha_publicación", updatable = false)
    private LocalDateTime fechaPublicacion;

}