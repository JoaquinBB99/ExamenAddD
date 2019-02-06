package es.fesac.noticias.dao;

import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.model.User;

public interface IMensajeRepository extends CrudRepository<User, Long> {

}
