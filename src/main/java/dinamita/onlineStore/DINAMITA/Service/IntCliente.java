package dinamita.onlineStore.DINAMITA.Service;

import java.util.List;

import dinamita.onlineStore.DINAMITA.Model.Cliente;

public interface IntCliente {
	
	public List<Cliente> obtenerListaClientes();
	public Cliente buscarPorId(int claveCliente);
	public void eliminarCliente(int claveCliente);
	public void guardarCliente(Cliente cliente);

}
