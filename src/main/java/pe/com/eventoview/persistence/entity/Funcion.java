/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.eventoview.persistence.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


/**
 *
 * @author Kowalski
 */
@Entity
@Data
@Builder
@Table(name = "funcion")
@NoArgsConstructor
@AllArgsConstructor
public class Funcion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFuncion")
    private Integer idFuncion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "usuarioCreacion")
    private Integer usuarioCreacion;

    @Column(name = "fechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "usuarioModificacion")
    private Integer usuarioModificacion;

    @Column(name = "fechaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
/*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncion")
    private Collection<Codigo> codigoCollection;
*/
}
