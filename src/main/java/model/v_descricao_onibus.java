package model;

public class v_descricao_onibus {
	
	private String Placa_Oni;
	private String Marca_Oni;
	private int Ano_Oni;
	private String Descricao_Oni;
	private int Codigo_Via;
	
	public String getPlaca_Oni() {
		return Placa_Oni;
	}
	public void setPlaca_Oni(String placa_Oni) {
		this.Placa_Oni = placa_Oni;
	}
	public String getMarca_Oni() {
		return Marca_Oni;
	}
	public void setMarca_Oni(String marca_Oni) {
		this.Marca_Oni = marca_Oni;
	}
	public int getAno_Oni() {
		return Ano_Oni;
	}
	public void setAno_Oni(int ano_Oni) {
		this.Ano_Oni = ano_Oni;
	}
	public String getDescricao_Oni() {
		return Descricao_Oni;
	}
	public void setDescricao_Oni(String descricao_Oni) {
		this.Descricao_Oni = descricao_Oni;
	}
	public int getCodigo_Via() {
		return Codigo_Via;
	}
	public void setCodigo_Via(int codigo_Via) {
		this.Codigo_Via = codigo_Via;
	}
	@Override
	public String toString() {
		return "v_descricao_onibus [Placa_Oni=" + Placa_Oni + ", Marca_Oni=" + Marca_Oni + ", Ano_Oni=" + Ano_Oni
				+ ", Descricao_Oni=" + Descricao_Oni + ", Codigo_Via=" + Codigo_Via + "]";
	}

	
}
