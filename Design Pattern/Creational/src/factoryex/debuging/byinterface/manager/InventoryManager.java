package factoryex.debuging.byinterface.manager;

import factoryex.debuging.byinterface.constant.DeviceType;
import factoryex.debuging.byinterface.dao.A2InventoryDaoImpl;
import factoryex.debuging.byinterface.dao.DUInventoryDaoImpl;
import factoryex.debuging.byinterface.dao.InventoryDao;
import factoryex.debuging.byinterface.model.A2Inventory;
import factoryex.debuging.byinterface.model.DUInventory;
import factoryex.debuging.byinterface.model.Inventory;

public class InventoryManager {

	public static Inventory getInventory(DeviceType deviceType){
		
		switch(deviceType){
		
			case A2:
				return new A2Inventory();
			case DU:
				return new DUInventory();
			default:
				return null; //return new RRUInventory();
		}
		
	}
	
	public static InventoryDao getInventoryDao(DeviceType deviceType){
		
		switch(deviceType){
		
			case A2:
				return new A2InventoryDaoImpl();
			case DU:
				return new DUInventoryDaoImpl();
			default:
				return null; //return new RRUInventoryDaoImpl();
		}
		
	}
}
