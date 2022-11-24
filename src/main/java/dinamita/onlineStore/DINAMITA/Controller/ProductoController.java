package dinamita.onlineStore.DINAMITA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dinamita.onlineStore.DINAMITA.Model.Producto;
import dinamita.onlineStore.DINAMITA.ServiceJpa.ProductoServiceJpa;

@Controller
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoServiceJpa serviceProducto;

	@GetMapping("/listaProductos")
	public String mostrarIndex(Model model) {
		model.addAttribute("productos", serviceProducto.obtenerListaProductos());
		return "producto/listaProductos";
	}

	@GetMapping("/crearProducto")
	public String crear(Producto producto) {
		return "producto/CtrlProductos";
	}

	@GetMapping("/eliminarProducto")
	public String eliminar(@RequestParam("codigoProducto") int codigoProducto) {
		serviceProducto.eliminarProducto(codigoProducto);
		return "redirect:/producto/listaProducto";
	}

	@GetMapping("/actualizarProducto")
	public String actualizar(@RequestParam("codigoProducto") int codigoProducto, Model model) {
		model.addAttribute("producto", serviceProducto.buscarPorId(codigoProducto));
		return "productos/CtrlProductos";
	}

	@PostMapping("/guardarProducto")
	public String guardar(Producto producto, Model model) {
		serviceProducto.guardarProducto(producto);
		return "redirect:/producto/listaProducto";
	}

}
