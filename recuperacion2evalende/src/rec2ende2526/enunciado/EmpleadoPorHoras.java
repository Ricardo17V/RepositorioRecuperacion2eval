package rec2ende2526.enunciado;

public class EmpleadoPorHoras extends EmpleadoTiempoCompleto{

	public EmpleadoPorHoras(String nombre, double salarioBase, Boolean autonomo, float irpf) {
		super(nombre, salarioBase, autonomo, irpf);
		
	}
	@Override
	public void calcularSalarioNeto() {
		double salarioBruto = 0;
		double salarioNeto = 0;
		if(autonomo == false) {
		salarioNeto = salarioBruto - (salarioBruto * irpf);
		}
		else {
			salarioNeto = salarioBruto - (salarioBruto*0.07);
		}
	}
	public void calcularSalarioBruto(double comisionesEmpleadoMes) {
		double salarioBruto = salarioBase + comisionesEmpleadoMes;
		if(comisionesEmpleadoMes>0) {
			throw new IllegalArgumentException("la comisión no puede ser negativa");
		}
	}
	public void calcularSalarioNeto(double comisionesEmpleadoMes) {
		double salarioNeto = 0;
		double salarioBruto = 0;
		if(autonomo = true) {
			salarioNeto = salarioBruto - (salarioBruto*comisionesEmpleadoMes);
		}
		else {
			salarioNeto = salarioBruto - (salarioBruto*0.07);
		}
	}
}
