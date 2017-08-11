package bo.jiang.demo.ibatis.dao;

import bo.jiang.demo.ibatis.bean.Man;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * @author shumpert.jiang
 * @date 2017/8/11 0011 14:46
 */
public class DaoImp extends SqlMapClientDaoSupport implements Dao {
  public List<Man> getList() {
    return getSqlMapClientTemplate().queryForList("getAllUsers", null);
  }

  public Man getByName(String name) {
    Man man = new Man();
    man.setName(name);
    return (Man)getSqlMapClientTemplate().queryForObject("getUsersByName", man);
  }

  public Man getById(String id) {
    Man man = new Man();
    man.setId(id);
    return (Man)getSqlMapClientTemplate().queryForObject("getUsersById", man);
  }

  public void insert(Man man) {
    getSqlMapClientTemplate().insert("insertUsers", man);
  }

  public void delete(String id) {
    Man man = new Man();
    man.setId(id);
    getSqlMapClientTemplate().delete("deleteUsers", man);
  }

  public void update(Man man) {
    getSqlMapClientTemplate().update("updateUsers", man);
  }
}
