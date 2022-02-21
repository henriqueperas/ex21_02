package model;

public class v_motorista_onibus {

	private String Codigo_Moto;
	private String Nome_Moto;
	
	public String getCodigo_Moto() {
		return Codigo_Moto;
	}
	public void setCodigo_Moto(String codigo_Moto) {
		this.Codigo_Moto = codigo_Moto;
	}
	public String getNome_Moto() {
		return Nome_Moto;
	}
	public void setNome_Moto(String nome_Moto) {
		this.Codigo_Moto = nome_Moto;
	}
	@Override
	public String toString() {
		return "v_motorista_onibus [Codigo_Moto=" + Codigo_Moto + ", Nome_Moto=" + Nome_Moto + "]";
	}
	
}
