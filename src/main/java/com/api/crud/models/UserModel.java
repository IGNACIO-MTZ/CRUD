package com.api.crud.models;
import jakarta.persistence.*;// Importa las anotaciones necesarias para el mapeo de la entidad en una base de datos relacional.

@Entity // Anota la clase como una entidad que será mapeada a una tabla en la base de datos.
@Table(name = "user")// Especifica que la tabla en la base de datos se llamará "user"
public class UserModel{
    @Id // Anota el atributo 'id' como la clave primaria de la entidad y especifica su generación automática.
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Especifica que la generación automática del valor
    // de 'id' se realizará mediante la estrategia de identidad.

    private long id;// Anota el atributo 'id ' como una columna en la tabla de la base de datos.
    @Column
    private String firstName;//Declaración de la variable para el primer nombre

    // La anotación @Column indica que este atributo se mapeará a una columna en la base de datos
    @Column
    private String LastName; //Declaración de la variable para el apellido

    @Column
    private String email;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
