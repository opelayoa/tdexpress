package mx.tiendas3b.tdexpress.repository;

import org.springframework.data.repository.CrudRepository;

import mx.tiendas3b.tdexpress.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
}
