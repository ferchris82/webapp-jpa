package org.chrisferdev.apiservlet.webapp.headers.repositories;

import org.chrisferdev.apiservlet.webapp.headers.models.entities.Usuario;

import java.sql.SQLException;

public interface UsuarioRepository extends CrudRepository<Usuario> {
    Usuario porUsername(String username) throws SQLException;
}
