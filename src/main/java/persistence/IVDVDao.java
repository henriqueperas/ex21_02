package persistence;

import java.sql.SQLException;
import java.util.List;

import model.v_descricao_viagem;

public interface IVDVDao {

	public String inserirVDO (v_descricao_viagem vdv) throws SQLException, ClassNotFoundException;
	public String atualizarVDO (v_descricao_viagem vdv) throws SQLException, ClassNotFoundException;
	public String execluirVDO (v_descricao_viagem vdv) throws SQLException, ClassNotFoundException;
	public v_descricao_viagem consultaVDO (v_descricao_viagem vdv) throws SQLException, ClassNotFoundException;
	public List<v_descricao_viagem> consultaVDO() throws SQLException, ClassNotFoundException;

	
}
