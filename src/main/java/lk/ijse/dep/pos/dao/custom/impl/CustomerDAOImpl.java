package lk.ijse.dep.pos.dao.custom.impl;

import lk.ijse.dep.pos.dao.CrudDAOImpl;
import lk.ijse.dep.pos.dao.custom.CustomerDAO;
import lk.ijse.dep.pos.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDAOImpl extends CrudDAOImpl<Customer,String> implements CustomerDAO {


    @Override
    public String getLastCustomerId() throws Exception {
        return (String) session.createNativeQuery("SELECT c.id FROM Customer c ORDER BY id DESC LIMIT 1").uniqueResult();
//            ResultSet rst = CrudUtil.execute("SELECT * FROM Customer ORDER BY id DESC LIMIT 1");
//            if (!rst.next()){
//                return null;
//            }else{
//                return rst.getString(1);
//            }
    }

}
