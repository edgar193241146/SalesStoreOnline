package dinamita.onlineStore.DINAMITA.Service;

import java.util.List;

import dinamita.onlineStore.DINAMITA.Model.Entrega;

public interface IntEntrega {
	
	public List<Entrega> obtenerListaEntregas();
	public void guardarEntrega(Entrega entrega);
	public Entrega buscarPorId(int claveEntrega);
	public void eliminarEntrega(int claveEntrega);
}
