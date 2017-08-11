package bo.jiang.demo.ibatis.dao;

import bo.jiang.demo.ibatis.bean.Man;

import java.util.List;

/**
 * @author shumpert.jiang
 * @date 2017/8/11 0011 14:44
 */
public interface Dao {
  public List<Man> getList();
  public Man getByName(String name);
  public Man getById(String id);
  public void insert(Man man);
  public void delete(String id);
  public void update(Man man);
}
