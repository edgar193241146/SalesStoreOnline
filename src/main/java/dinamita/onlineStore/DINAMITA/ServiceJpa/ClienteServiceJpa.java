package dinamita.onlineStore.DINAMITA.ServiceJpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dinamita.onlineStore.DINAMITA.Model.Cliente;
import dinamita.onlineStore.DINAMITA.Repository.ClienteRepository;
import dinamita.onlineStore.DINAMITA.Service.IntCliente;

@Service
public class ClienteServiceJpa implements IntCliente {

	@Autowired
	private ClienteRepository repoCliente;

	@Override
	public List<Cliente> obtenerListaClientes() {
		return repoCliente.findAll();
	}

	@Override
	public Cliente buscarPorId(int claveCliente) {
		Optional<Cliente> cliente = repoCliente.findById(claveCliente);
		if (cliente.isPresent()) {
			return cliente.get();
		} else {
			return null;
		}

	}

	@Override
	public void eliminarCliente(int claveCliente) {
		repoCliente.deleteById(claveCliente);

	}

	@Override
	public void guardarCliente(Cliente cliente) {
		repoCliente.save(cliente);
	}

}
