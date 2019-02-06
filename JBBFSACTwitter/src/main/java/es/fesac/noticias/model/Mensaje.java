package es.fesac.noticias.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.tomcat.jni.User;

@Entity
public class Mensaje {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String messenger;

    User use = new User();


}
