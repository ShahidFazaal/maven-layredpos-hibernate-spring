package lk.ijse.dep.pos.dao.custom;

import lk.ijse.dep.pos.dao.CrudDAO;
import lk.ijse.dep.pos.entity.Customer;

public interface CustomerDAO extends CrudDAO<Customer,String> {
    public  String getLastCustomerId() throws Exception;
}
