package rec2ende2526.enunciado;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmpleadoPorHorasTest {

    private static List<EmpleadoPorHoras> listaEmpleados;  
    EmpleadoPorHoras empleado;

    public EmpleadoPorHorasTest() {
    	
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][] {
        	{"Miguel Ángel",2000, true, 0.6},
            {"Enrique",1500, false, 0.33},
            {"Paco",3000, false, 0.5},
            {"Marcos",2000, true, 0.7},
            {"Manolo",0, false, 0}
        });
    }

    @BeforeClass
    public static void iniciarPruebasClase() {
        listaEmpleados = new ArrayList<EmpleadoPorHoras>();
        System.out.println("Creando lista de empleados");
    }

    
    @AfterClass
    public static void finalizarPruebasClase() {
        listaEmpleados = null;  
        System.out.println("lista liberada");
    }

   
    @Before
    public void preparar() {
        empleado = new EmpleadoPorHoras("", 0, null, 0);
    }
    
    @After
    public void limpiar() {
        empleado = null;
    }


    @Ignore("Test ignorado temporalmente")
    @Test
    public void testSalario() {
        throw new RuntimeException("Este test es ignoado");
    }
}