package mx.tiendas3b.tdexpress.repository;

import org.springframework.data.repository.CrudRepository;

import mx.tiendas3b.tdexpress.entities.Acceso;
import mx.tiendas3b.tdexpress.entities.AccesoId;

public interface AccesoRepository extends CrudRepository<Acceso, AccesoId> {

}
