package bo.jiang.demo.ibatis.bean;

/**
 * @author shumpert.jiang
 * @date 2017/8/11 0011 14:43
 */
public class Man {
  private String id;
  private String name;

  public Man() {}

  public Man(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
