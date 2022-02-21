package model;

public class v_descricao_viagem {

	private int Codigo_Via;
	private String Oni_Via;
	private String Moto_Via;
	private int Hora_Saida_Via;
	private int Hora_Chegada_Via;
	private String Partida_via;
	private String Destino_Via;
	
	public int getCodigo_Via() {
		return Codigo_Via;
	}
	public void setCodigo_Via(int codigo_Via) {
		Codigo_Via = codigo_Via;
	}
	public String getOni_Via() {
		return Oni_Via;
	}
	public void setOni_Via(String oni_Via) {
		Oni_Via = oni_Via;
	}
	public String getMoto_Via() {
		return Moto_Via;
	}
	public void setMoto_Via(String moto_Via) {
		Moto_Via = moto_Via;
	}
	public int getHora_Saida_Via() {
		return Hora_Saida_Via;
	}
	public void setHora_Saida_Via(int hora_Saida_Via) {
		Hora_Saida_Via = hora_Saida_Via;
	}
	public int getHora_Chegada_Via() {
		return Hora_Chegada_Via;
	}
	public void setHora_Chegada_Via(int hora_Chegada_Via) {
		Hora_Chegada_Via = hora_Chegada_Via;
	}
	public String getPartida_via() {
		return Partida_via;
	}
	public void setPartida_via(String partida_via) {
		Partida_via = partida_via;
	}
	public String getDestino_Via() {
		return Destino_Via;
	}
	public void setDestino_Via(String destino_Via) {
		Destino_Via = destino_Via;
	}
	
	@Override
	public String toString() {
		return "v_descricao_viagem [Codigo_Via=" + Codigo_Via + ", Oni_Via=" + Oni_Via + ", Moto_Via=" + Moto_Via
				+ ", Hora_Saida_Via=" + Hora_Saida_Via + ", Hora_Chegada_Via=" + Hora_Chegada_Via + ", Partida_via="
				+ Partida_via + ", Destino_Via=" + Destino_Via + "]";
	}
	
}
