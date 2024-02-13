package com.api.crud.repositories;

import com.api.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository: Esta anotación marca la interfaz como un repositorio, que es una clase capaz de realizar consultas en la base de datos.
@Repository
    /*
    * Esta línea indica que la interfaz 'IUserRepository' extiende (hereda) de 'JpaRepository'.
    * JpaRepository proporciona métodos para realizar operaciones comunes en la base de datos, y se especializa aquí
    * para manejar entidades del tipo 'UserModel' con una clave primaria de tipo 'Long'.
    */
public interface IUserRepository extends JpaRepository<UserModel, Long> {
    /*
    * Una clave primaria de tipo 'Long' significa que la identificación única de cada registro en la base de datos
    * es representada por números enteros largos.
    * */
}
