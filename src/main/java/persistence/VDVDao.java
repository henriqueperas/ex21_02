package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.v_descricao_onibus;
import model.v_descricao_viagem;

public class VDVDao implements IVDVDao{
	
	private GenericDao gDao;
	
	public VDVDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	@Override
	public String inserirVDO(v_descricao_viagem vdv) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "INSERT INTO v_descricao_onibus VALUES(?,?,?,?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, vdv.getCodigo_Via());
		ps.setString(2, vdv.getOni_Via());
		ps.setString(3, vdv.getMoto_Via());
		ps.setInt(4, vdv.getHora_Saida_Via());
		ps.setInt(5, vdv.getHora_Chegada_Via());
		ps.setString(6, vdv.getPartida_via());
		ps.setString(7, vdv.getDestino_Via());
		ps.execute();
		ps.close();
		c.close();
		
		return "v_descricao_viagem inserido com sucesso";
	}

	@Override
	public String atualizarVDO(v_descricao_viagem vdv) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "UPDATE v_descricao_viagem SET Codigo_Via = ?, Oni_Via = ?, Moto_Via = ?, Hora_Saida_Via = ?, Hora_Chegada_Via = ?, Partida_via = ?, Destino_Via = ? WHERE Codigo_Via = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, vdv.getCodigo_Via());
		ps.setString(2, vdv.getOni_Via());
		ps.setString(3, vdv.getMoto_Via());
		ps.setInt(4, vdv.getHora_Saida_Via());
		ps.setInt(5, vdv.getHora_Chegada_Via());
		ps.setString(6, vdv.getPartida_via());
		ps.setString(7, vdv.getDestino_Via());
		ps.execute();
		ps.close();
		c.close();
		
		return "v_descricao_viagem atualizada com sucesso";
	}

	@Override
	public String execluirVDO(v_descricao_viagem vdv) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "DELETE v_descricao_viagem WHERE Codigo_Via = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, vdv.getCodigo_Via());
		ps.execute();
		ps.close();
		c.close();
		
		return "v_descricao_viagem excluida com sucesso";
	}

	@Override
	public v_descricao_viagem consultaVDO(v_descricao_viagem vdv) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "SELECT Codigo_Via , Marca_Oni, Moto_Via, Hora_Saida_Via, Hora_Chegada_Via, Partida_via, Descricao_Oni FROM tbOnibus, tbViagem WHERE Codigo_Via = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, vdv.getCodigo_Via());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			vdv.setCodigo_Via(0);
			vdv.setOni_Via("Marca_Oni");
			vdv.setMoto_Via("Moto_Via");
			vdv.setHora_Saida_Via(0);
			vdv.setHora_Chegada_Via(0);
			vdv.setPartida_via("Partida_via");
			vdv.setDestino_Via("Descricao_Oni");
		}
		rs.close();
		ps.close();
		c.close();
		
		return vdv;
	}

	@Override
	public List<v_descricao_viagem> consultaVDO() throws SQLException, ClassNotFoundException {
		List<v_descricao_viagem> vdvs = new ArrayList<v_descricao_viagem>();
		
		Connection c = gDao.getConnection();
		String sql = "SELECT Codigo_Via , Marca_Oni, Moto_Via, Hora_Saida_Via, Hora_Chegada_Via, Partida_via, Descricao_Oni FROM tbViagem";
		PreparedStatement ps = c.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			v_descricao_viagem vdv = new v_descricao_viagem();
			vdv.setCodigo_Via(0);
			vdv.setOni_Via("Marca_Oni");
			vdv.setMoto_Via("Moto_Via");
			vdv.setHora_Saida_Via(0);
			vdv.setHora_Chegada_Via(0);
			vdv.setPartida_via("Partida_via");
			vdv.setDestino_Via("Descricao_Oni");
			
			vdvs.add(vdv);
		}
		rs.close();
		ps.close();
		c.close();
		
		return vdvs;
	}

}
