package factoryex.debuging.byinterface.dao;
import factoryex.debuging.byinterface.model.CallHomeBean;

public interface InventoryDao {

	boolean isUnknownDevice(CallHomeBean callHomeBean);
}
