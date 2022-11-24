package dinamita.onlineStore.DINAMITA.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import dinamita.onlineStore.DINAMITA.Model.Categoria;

public interface IntCategoria {
	
	public List<Categoria> obtenerListaCategorias();
	public Categoria buscarPorId(int claveCategoria);
	public void eliminarCategoria(int claveCategoria);
	public void guardarCategoria(Categoria categoria); 

}
