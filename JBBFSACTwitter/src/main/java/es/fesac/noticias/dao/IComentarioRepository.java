package es.fesac.noticias.dao;

import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.model.User;

public interface IComentarioRepository extends CrudRepository<User, Long> {

}
