package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.v_descricao_onibus;

public class VDODao implements IVDODao {
	
	private GenericDao gDao;
	
	public VDODao(GenericDao gDao) {
		this.gDao = gDao;
	}

	@Override
	public String inserirVDO(v_descricao_onibus vdo) throws SQLException, ClassNotFoundException {
		
		Connection c = gDao.getConnection();
		String sql = "INSERT INTO v_descricao_onibus VALUES(?,?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, vdo.getPlaca_Oni());
		ps.setString(2, vdo.getMarca_Oni());
		ps.setInt(3, vdo.getAno_Oni());
		ps.setString(4, vdo.getDescricao_Oni());
		ps.setInt(5, vdo.getCodigo_Via());
		ps.execute();
		ps.close();
		c.close();
		
		return "v_descricao_onibus inserido com sucesso";
	}

	@Override
	public String atualizarVDO(v_descricao_onibus vdo) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "UPDATE v_descricao_onibus SET Placa_Oni = ?, Marca_Oni = ?, Ano_Oni = ?, Descricao_Oni = ?, Codigo_Via = ? WHERE Placa_Oni = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, vdo.getMarca_Oni());
		ps.setInt(2, vdo.getAno_Oni());
		ps.setString(3, vdo.getDescricao_Oni());
		ps.setInt(4, vdo.getCodigo_Via());
		ps.setString(5, vdo.getPlaca_Oni());
		ps.execute();
		ps.close();
		c.close();
		
		return "v_descricao_onibus atualizada com sucesso";
	}

	@Override
	public String execluirVDO(v_descricao_onibus vdo) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "DELETE v_descricao_onibus WHERE Placa_Oni = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, vdo.getPlaca_Oni());
		ps.execute();
		ps.close();
		c.close();
		
		return "v_descricao_onibus excluida com sucesso";
	}

	@Override
	public v_descricao_onibus consultaVDO(v_descricao_onibus vdo) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "SELECT Placa_Oni , Marca_Oni, Ano_Oni, Descricao_Oni, Codigo_Via FROM tbOnibus, tbViagem WHERE Placa_Oni = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, vdo.getPlaca_Oni());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			vdo.setPlaca_Oni("Placa_Oni");
			vdo.setMarca_Oni("Marca_Oni");
			vdo.setAno_Oni(0);
			vdo.setDescricao_Oni("Descricao_Oni");
			vdo.setCodigo_Via(0);
		}
		rs.close();
		ps.close();
		c.close();
		
		return vdo;
	}

	@Override
	public List<v_descricao_onibus> consultaVDO() throws SQLException, ClassNotFoundException {
		List<v_descricao_onibus> vdos = new ArrayList<v_descricao_onibus>();
		
		Connection c = gDao.getConnection();
		String sql = "SELECT Placa_Oni, Marca_Oni, Ano_Oni, Descricao_Oni, Codigo_Via FROM tbOnibus, tbViagem";
		PreparedStatement ps = c.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			v_descricao_onibus vdo = new v_descricao_onibus();
			vdo.setPlaca_Oni("Placa_Oni");
			vdo.setMarca_Oni("Marca_Oni");
			vdo.setAno_Oni(0);
			vdo.setDescricao_Oni("Descricao_Oni");
			vdo.setCodigo_Via(0);
			
			vdos.add(vdo);
		}
		rs.close();
		ps.close();
		c.close();
		
		return vdos;
	}

}
