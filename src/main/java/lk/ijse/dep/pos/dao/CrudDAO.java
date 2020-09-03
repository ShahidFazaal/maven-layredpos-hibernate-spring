package lk.ijse.dep.pos.dao;

import lk.ijse.dep.pos.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;

public interface CrudDAO <T extends SuperEntity,ID extends Serializable> extends SuperDAO {
        public List<T> findAll() throws Exception;
        public  T find(ID pk) throws Exception;
        public void save(T entity) throws Exception;
        public void update(T entity) throws Exception;
        public void delete(ID key) throws Exception;
    }

