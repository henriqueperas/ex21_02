package persistence;

import java.sql.SQLException;
import java.util.List;

import model.v_motorista_onibus;

public interface IVMODao {
	
	public String inserirVDO (v_motorista_onibus vmo) throws SQLException, ClassNotFoundException;
	public String atualizarVDO (v_motorista_onibus vmo) throws SQLException, ClassNotFoundException;
	public String execluirVDO (v_motorista_onibus vmo) throws SQLException, ClassNotFoundException;
	public v_motorista_onibus consultaVDO (v_motorista_onibus vmo) throws SQLException, ClassNotFoundException;
	public List<v_motorista_onibus> consultaVDO() throws SQLException, ClassNotFoundException;

}
