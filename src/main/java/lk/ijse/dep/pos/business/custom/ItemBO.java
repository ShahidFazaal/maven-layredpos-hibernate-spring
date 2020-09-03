package lk.ijse.dep.pos.business.custom;

import lk.ijse.dep.pos.business.SuperBO;
import lk.ijse.dep.pos.util.ItemTM;

import java.math.BigDecimal;
import java.util.List;

public interface ItemBO extends SuperBO {
    public  String getNewItemCode() throws Exception;
    public List<ItemTM> getAllItems() throws Exception;
    public void saveItem(String code, String description, int qtyOnHand, BigDecimal unitPrice) throws Exception;
    public void deleteItem(String itemCode) throws Exception;
    public void updateItem(String description, int qtyOnHand, BigDecimal unitPrice, String itemCode) throws Exception;

}
