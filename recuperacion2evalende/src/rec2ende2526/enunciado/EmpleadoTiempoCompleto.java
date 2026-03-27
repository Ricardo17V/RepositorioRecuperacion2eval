package rec2ende2526.enunciado;

public class EmpleadoTiempoCompleto extends Empleado {

	public EmpleadoTiempoCompleto(String nombre, double salarioBase, Boolean autonomo, float irpf) {
		super(nombre, salarioBase, autonomo, irpf);
	}

	@Override
	public void calcularSalarioNeto() {
		double salarioBruto = 0;
		double salarioNeto = salarioBruto - (salarioBruto * irpf);
	}
}
