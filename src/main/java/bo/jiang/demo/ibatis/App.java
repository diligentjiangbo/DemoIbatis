package bo.jiang.demo.ibatis;

import bo.jiang.demo.ibatis.bean.Man;
import bo.jiang.demo.ibatis.dao.Dao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author shumpert.jiang
 * @date 2017/8/11 0011 14:43
 */
public class App {
  private static final Logger LOGGER = LogManager.getLogger(App.class);

  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    Dao dao = (Dao)applicationContext.getBean("DaoImp");
//    dao.insert(new Man("1", "shumpert"));
    dao.update(new Man("1", "bo"));
    List<Man> list = dao.getList();
    for (Man man : list) {
      System.out.println(man.getId() + ":" + man.getName());
    }

//    Man man = dao.getById("2");
//    System.out.println(man.getId() + ":" + man.getName());
//    dao.delete("1");
  }
}
