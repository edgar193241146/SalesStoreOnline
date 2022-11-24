package dinamita.onlineStore.DINAMITA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dinamita.onlineStore.DINAMITA.Model.Categoria;
import dinamita.onlineStore.DINAMITA.Service.IntCategoria;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private IntCategoria serviceCategoria;

	@GetMapping("/listaCategorias")
	public String mostrarListaCategoria(Model model) {
		model.addAttribute("categorias", serviceCategoria.obtenerListaCategorias());
		return "categoria/listaCategorias";
	}

	@GetMapping("/crearCategoria")
	public String crear(Categoria categoria) {
		return "categoria/formularioCategoria";
	}

	@GetMapping("/eliminarCategoria")
	public String eliminar(@RequestParam("claveCategoria") int claveCategoria, Model model) {
		serviceCategoria.eliminarCategoria(claveCategoria);
		return "redirect:/categoria/listaCategorias";
	}

	@PostMapping("/guardarCategoria")
	public String guardar(Categoria categoria) {
		serviceCategoria.guardarCategoria(categoria);
		return "redirect:/categoria/listaCategorias";
	}

	@GetMapping("/actualizarCategoria")
	public String actualizar(@RequestParam("claveCategoria") int claveCategoria, Model model) {
		model.addAttribute("categoria", serviceCategoria.buscarPorId(claveCategoria));
		return "categoria/formularioCategoria";
	}

}
