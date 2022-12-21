package com.gestion.permisos.controlador;


import com.gestion.permisos.entidades.Funcionario;
import com.gestion.permisos.servicio.FuncionarioService;
import com.gestion.permisos.util.paginacion.PageRender;
import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Map;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/verf/{id_f}")
    public String verDetalleDelFuncionario(@PathVariable(value = "id_f") Long id_f, Map<String, Object> modelo, RedirectAttributes flash) {
        Funcionario funcionario = funcionarioService.findOne(id_f);
        if (funcionario == null) {
            flash.addAttribute("error", "El funcionario no existe en la base de datos");
            return "redirect:/listarf";
        }
        modelo.put("funcionario", funcionario);
        modelo.put("titulo", "Detalles del funcionario" + funcionario.getNombres_f());
        return "verf";

    }

    @GetMapping({ "/listarf"})
    public String listarFuncionarios(@RequestParam(name = "page", defaultValue = "0") int page, Model modelo) {
        Pageable pageRequest = PageRequest.of(page, 5);
        Page<Funcionario> funcionarios = funcionarioService.findAll(pageRequest);
        PageRender<Funcionario> pageRender = new PageRender<>("/listarf", funcionarios);

        modelo.addAttribute("titulo", "Listado de funcionarios");
        modelo.addAttribute("funcionarios", funcionarios);
        modelo.addAttribute("page", pageRender);
        return "listarf";
    }

    @GetMapping("/formf")
    public String mostrarFormularioDeRegistrarFuncnionario(Map<String, Object> modelo) {
        Funcionario funcionario = new Funcionario();
        modelo.put("funcionario", funcionario);
        modelo.put("titulo", "Registro de funcionarios");
        return "formf";
    }

    @PostMapping("/formf")
    public String guardarFuncionario(@Valid Funcionario funcionario, BindingResult result, Model modelo, RedirectAttributes flash, SessionStatus status) {
        if (result.hasErrors()) {
            modelo.addAttribute("titulo", "Registro de Funcionarios");
            return "formf";
        }
        String mensaje = (funcionario.getId_f() != null) ? "El Funcionario ha sido editado con exito" : "Empleado registrado con exito";
        funcionarioService.save(funcionario);
        status.setComplete();
        flash.addFlashAttribute("success", mensaje);
        return "redirect:listarf";

    }

    @GetMapping("/formf/{id_f}")
    public String editarFuncionario(@PathVariable(value = "id_f") Long id_f, Map<String, Object> modelo, RedirectAttributes flash) {
        Funcionario funcionario = null;
        if (id_f > 0) {
            funcionario = funcionarioService.findOne(id_f);
            if (funcionario == null) {
                flash.addFlashAttribute("error", "El Id del Funcionario no existe");
                return "redirect:/listarf";
            }
        } else {
            flash.addFlashAttribute("error", "El Id del funcionario no puede ser cero");
            return "redirect:/listarf";
        }
        modelo.put("funcionario", funcionario);
        modelo.put("titulo", "Edición de Funcionario");
        return "formf";
    }

    @GetMapping("/eliminarf/{id_f}")
    public String eliminarFuncionario(@PathVariable(value="id_f")Long id_f, RedirectAttributes flash){
        if(id_f>0){
            funcionarioService.delete(id_f);
            flash.addFlashAttribute("success","Funcionario eliminado con exito");

        }
        return "redirect:/listarf";
    }
/*
    @GetMapping("/exportarPDF")
    public void exportarListadoDeEmpleadosEnPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");

        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String fechaActual = dateFormatter.format(new Date());

        String cabecera = "Content-Disposition";
        String valor = "attachment; filename=Empleados_" + fechaActual + ".pdf";

        response.setHeader(cabecera, valor);

        List<Empleado> empleados = empleadoService.findAll();

        EmpleadoExporterPDF exporter = new EmpleadoExporterPDF(empleados);
        exporter.exportar(response);
    }

    @GetMapping("/exportarExcel")
    public void exportarListadoDeEmpleadosEnExcel(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/octet-stream");

        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String fechaActual = dateFormatter.format(new Date());

        String cabecera = "Content-Disposition";
        String valor = "attachment; filename=Empleados_" + fechaActual + ".xlsx";

        response.setHeader(cabecera, valor);

        List<Empleado> empleados = empleadoService.findAll();

        EmpleadoExporterExcel exporter = new EmpleadoExporterExcel(empleados);
        exporter.exportar(response);
    }
    */

}
