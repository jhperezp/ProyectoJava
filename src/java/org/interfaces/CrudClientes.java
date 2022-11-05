/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.interfaces;

import java.util.List;
import org.models.Clientes;

/**
 *
 * @author Jose Humberto Perez
 */
public interface CrudClientes {
    public List listar();
    public Clientes list();
    public boolean insertar(Clientes clientes);
    public boolean modificar(Clientes clientes);
    public boolean eliminar(Clientes clientes);
}
