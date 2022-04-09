package uc12.pi.repository;

import org.springframework.data.repository.CrudRepository;

import uc12.pi.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	
	Evento findByCodigo(long codigo);

}
