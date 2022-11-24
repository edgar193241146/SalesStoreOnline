package dinamita.onlineStore.DINAMITA.ServiceJpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dinamita.onlineStore.DINAMITA.Model.Producto;
import dinamita.onlineStore.DINAMITA.Repository.ProductoRepository;
import dinamita.onlineStore.DINAMITA.Service.IntProducto;

@Service
public class ProductoServiceJpa implements IntProducto {

	@Autowired
	private ProductoRepository repoProducto;

	@Override
	public List<Producto> obtenerListaProductos() {
		return repoProducto.findAll();
	}

	@Override
	public Producto buscarPorId(int codigoProducto) {
		Optional<Producto> producto = repoProducto.findById(codigoProducto);
		if (producto.isPresent()) {
			return producto.get();
		} else {
			return null;
		}
	}

	@Override
	public void eliminarProducto(int codigoProducto) {
		repoProducto.deleteById(codigoProducto);
	}

	@Override
	public void guardarProducto(Producto producto) {
		repoProducto.save(producto);
	}

}
