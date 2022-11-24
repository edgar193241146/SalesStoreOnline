package dinamita.onlineStore.DINAMITA.Service;

import java.util.List;

import dinamita.onlineStore.DINAMITA.Model.Producto;

public interface IntProducto {
	
	public List<Producto> obtenerListaProductos();
	public Producto buscarPorId(int codigoProducto);
	public void eliminarProducto(int codigoProducto);
	public void guardarProducto(Producto producto);

}
