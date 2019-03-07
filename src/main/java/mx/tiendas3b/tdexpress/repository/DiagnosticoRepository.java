package mx.tiendas3b.tdexpress.repository;

import org.springframework.data.repository.CrudRepository;

import mx.tiendas3b.tdexpress.entities.AccesoId;
import mx.tiendas3b.tdexpress.entities.Diagnostico;

public interface DiagnosticoRepository extends CrudRepository<Diagnostico, AccesoId> {

}
