package factoryex.debuging.byinterface;

import java.util.ArrayList;
import java.util.List;

import factoryex.debuging.byinterface.constant.DeviceType;
import factoryex.debuging.byinterface.dao.InventoryDao;
import factoryex.debuging.byinterface.exception.BlackListException;
import factoryex.debuging.byinterface.manager.InventoryManager;
import factoryex.debuging.byinterface.model.CallHomeBean;
import factoryex.debuging.byinterface.model.Inventory;

public class MainProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inventory inventory = InventoryManager.getInventory(DeviceType.A2);
		Inventory inventory2 = InventoryManager.getInventory(DeviceType.DU);
		
		List<Inventory> inventoryList = new ArrayList<Inventory>();
		inventoryList.add(inventory);
		inventoryList.add(inventory2);
		
		InventoryDao inventoryDao = InventoryManager.getInventoryDao(DeviceType.A2);// DeviceType get from Input Request
		InventoryDao inventoryDao2 = InventoryManager.getInventoryDao(DeviceType.DU);// DeviceType get from Input Request
		
		CallHomeBean callHomeBean = new CallHomeBean();
		
		inventoryDao.isUnknownDevice(callHomeBean);
		inventoryDao2.isUnknownDevice(callHomeBean);
		
	}

	public static void throwBlackListError() throws BlackListException{
		
		String errorMsg = "";
		System.out.printf("Logging Msg : %s",errorMsg);
		throw new BlackListException(errorMsg);
	}
	
	public static void validateBlackList(List<Inventory> inventoryList) throws BlackListException{

		if(inventoryList.get(0).isBlackListed()){
			throwBlackListError();
		}
	}
		
}
