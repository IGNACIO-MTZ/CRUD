package com.api.crud.services;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

/*
    * /@Service: Esta anotación marca la clase como un componente de servicio, indicando que tiene lógica
    * de negocio o manipulación de datos que puede ser utilizada en otras partes de la aplicación.
    * */
@Service
public class UserService {

    /*
    * @Autowired: Esta anotación se utiliza para realizar la inyección de dependencias, es decir, automáticamente
    *  se asigna una instancia de IUserRepository al campo userRepository.*/
    @Autowired
            /*
            * Declara una variable llamada 'userRepository' que almacenará una instancia de la interfaz IUserRepository.
            * La asignación de un valor a esta variable podría realizarse mediante inyección de dependencias u otras técnicas.
            * */
            IUserRepository userRepository;

            /*
             *   Este método obtiene todos los usuarios de la base de datos.
             * - userRepository.findAll(): Utiliza el método findAll() proporcionado por la interfaz IUserRepository,
             *   que internamente ejecuta una consulta para recuperar todos los registros de la tabla de usuarios.
             * - El resultado se devuelve como un ArrayList<UserModel>, que contiene todos los usuarios recuperados.
             */
            public ArrayList<UserModel> getUsers(){
                return (ArrayList<UserModel>) userRepository.findAll();
            }

            public UserModel saveUser(UserModel user){
                return userRepository.save(user);
            }

            public Optional<UserModel> getById(Long id){
                return userRepository.findById(id);
            }
            public UserModel updateId (UserModel request, long id){
                UserModel user = userRepository.findById(id).get();
                user.setFirstName(request.getFirstName());
                user.setLastName(request.getLastName());
                user.setEmail(request.getEmail());
                return user;
            }

            public Boolean deleteUser(long id){
                try {
                    userRepository.deleteById(id);
                    return true;
                }catch (Exception e){
                    return false;
                }
            }
}
