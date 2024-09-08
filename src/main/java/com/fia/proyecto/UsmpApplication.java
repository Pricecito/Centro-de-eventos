package com.fia.proyecto;

import com.fia.proyecto.models.entity.Administrador;
import com.fia.proyecto.models.entity.Bolsa_de_trabajo;
import com.fia.proyecto.models.entity.Contrato;
import com.fia.proyecto.models.entity.Curso;
import com.fia.proyecto.models.entity.Directorio;
import com.fia.proyecto.models.entity.Eventos;
import com.fia.proyecto.models.entity.Jornada;
import com.fia.proyecto.models.entity.Noticias;
import com.fia.proyecto.models.entity.Roles;
import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.AdministradorService;
import com.fia.proyecto.models.service.Bolsa_de_trabajoService;
import com.fia.proyecto.models.service.ContratoService;
import com.fia.proyecto.models.service.CursoService;
import com.fia.proyecto.models.service.DirectorioService;
import com.fia.proyecto.models.service.EventosService;
import com.fia.proyecto.models.service.JornadaService;
import com.fia.proyecto.models.service.NoticiasService;
import com.fia.proyecto.models.service.RolesService;
import com.fia.proyecto.models.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsmpApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UsmpApplication.class, args);
	}
    @Autowired
    private RolesService rolSvc;
    @Autowired
    private UsuarioService usuSvc;
    @Autowired
    private Bolsa_de_trabajoService bdtSvc;
    @Autowired 
    private CursoService cSvc;
    @Autowired 
    private DirectorioService dSvc;
    @Autowired 
    private EventosService eveSvc;
    @Autowired 
    private NoticiasService nSvc;
    @Autowired
    private JornadaService jSvc;
    @Autowired
    private AdministradorService aSvc;
    @Autowired
    private ContratoService conSvc;
        
    public void run(String... args) throws Exception {
       /*//Rol
        Roles usu=new Roles("Estudiante");
        Roles doc=new Roles("Docente");
        rolSvc.saveOrUpdate(usu);
        rolSvc.saveOrUpdate(doc);
        System.out.println("Roles guardados");
        //Crea Usuario
        Usuarios Admin1=new Usuarios("JUAN MATIAS", "GUTIERREZ CASANI","matias_gutierrez@usmp.pe", "1254",72412912, 977358975,"perfil.jpg","Peru","Arequipa",usu);
        Usuarios Admin2=new Usuarios("OSCAR RENE", "PINEDA FLORES","oscar_pineda@usmp.pe", "1254",73412912, 999988866,"perfil.jpg","Peru","Arequipa",usu);
        Usuarios Admin3=new Usuarios("ANDREA NIKOLE", "ALVA CHAVEZ","andrea_alva@usmp.pe", "1254",74412912, 999777555,"perfil.jpg","Peru","Arequipa",usu);
        Usuarios Admin4=new Usuarios("GERALDINE LOANA", "YANQUE FLORES","geraldine_yanque@usmp.pe", "1254",75412912, 999777666,"perfil.jpg","Peru","Arequipa",usu);        
        usuSvc.saveOrUpdate(Admin1);
        usuSvc.saveOrUpdate(Admin2);
        usuSvc.saveOrUpdate(Admin3);
        usuSvc.saveOrUpdate(Admin4);
        System.out.println("Usuarios guardados");
        //Creando Administrador
        Administrador A1=new Administrador(Admin1);
        Administrador A2=new Administrador(Admin2);
        Administrador A3=new Administrador(Admin3);
        Administrador A4=new Administrador(Admin4);
        aSvc.saveOrUpdate(A1);
        aSvc.saveOrUpdate(A2);
        aSvc.saveOrUpdate(A3);
        aSvc.saveOrUpdate(A4);
        System.out.println("Administradores creados");
        //Creando jornada
        Jornada j1=new Jornada("Jornada Laboral Completo");
        Jornada j2=new Jornada("Jornada Laboral Parcial");
        Jornada j3=new Jornada("Jornada Laboral Flexible");
        jSvc.saveOrUpdate(j1);
        jSvc.saveOrUpdate(j2);
        jSvc.saveOrUpdate(j3);
        escribir("Jornadas guardadas");
        //Creando Contrato
        Contrato c1=new Contrato("Contrato indefinido");
        Contrato c2=new Contrato("Contrato definido");
        Contrato c3=new Contrato("Contrato eventual");
        conSvc.saveOrUpdate(c1);
        conSvc.saveOrUpdate(c2);
        conSvc.saveOrUpdate(c3);
        escribir("Contratos guardados");
        //Bolsa de trabajo
        Bolsa_de_trabajo C=new Bolsa_de_trabajo("ANALISTA DE SOPORTE INFORMATICO", "SELEKTO CONSULTORES EN RECURSOS HUMANOS", 1, "Descripcion de bolsa de trabajo","Ingles-Intermedio","Informacion adicional",c2,j1 );
        bdtSvc.saveOrUpdate(C);
        System.out.println("Bolsa guardado");*/
        //Curso
        /*Curso D=new Curso ("Calculo I", "Curso de matematicas y ciencias", B);
        cSvc.saveOrUpdate(D);
        System.out.println("Curso guardado");
        //Directorio
        Directorio E=new Directorio("Coordinacion Sistemas", 987654321);
        dSvc.saveOrUpdate(E);
        System.out.println("Directorio guardado");
        //Eventos
        Eventos G=new Eventos("Eventos 1", "Eventos de prueba", "La perla","01/11/2023","08/11/2023","imagen1.jpg",B);
        eveSvc.saveOrUpdate(G);
        System.out.println("Evento guardado");
        //Noticia
        Noticias H=new Noticias("NOTICIA IMPACTANTE", "Noticia de ejemplo","imagen1.jpg", B);
        nSvc.saveOrUpdate(H);
        Noticias I=new Noticias("NOTICIA IMPACTANTE", "Noticia de ejemplo","imagen1.jpg", B);
        nSvc.saveOrUpdate(I);
        System.out.println("Noticia guardado");*/
        
    }
    public static void escribir(String m){
        System.out.println(m);
    }

}
