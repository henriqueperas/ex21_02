package persistence;

import java.sql.SQLException;
import java.util.List;

import model.v_descricao_onibus;

public interface IVDODao {
	
	public String inserirVDO (v_descricao_onibus vdo) throws SQLException, ClassNotFoundException;
	public String atualizarVDO (v_descricao_onibus vdo) throws SQLException, ClassNotFoundException;
	public String execluirVDO (v_descricao_onibus vdo) throws SQLException, ClassNotFoundException;
	public v_descricao_onibus consultaVDO (v_descricao_onibus vdo) throws SQLException, ClassNotFoundException;
	public List<v_descricao_onibus> consultaVDO() throws SQLException, ClassNotFoundException;

}
