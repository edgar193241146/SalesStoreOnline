package dinamita.onlineStore.DINAMITA.Service;

import java.util.List;

import dinamita.onlineStore.DINAMITA.Model.Compra;
import dinamita.onlineStore.DINAMITA.Model.Producto;

public interface IntCompra {

	public List<Compra> obtenerListaCompras();
	public Compra buscarPorFolio(int folioCompra);
	public void eliminarCompra(int folioCompra);
	public void guardarCompra(Compra compra);
}
