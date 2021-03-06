package lk.ijse.dep.pos.dao.custom;

import lk.ijse.dep.pos.dao.SuperDAO;
import lk.ijse.dep.pos.entity.CustomEntity;

import java.util.List;

public interface QueryDAO extends SuperDAO {
    CustomEntity getOrderDetail(String orderId) throws Exception;
    CustomEntity getOrderDetail2(String orderId) throws Exception;
    List<CustomEntity> getAllDetails() throws Exception;
}
