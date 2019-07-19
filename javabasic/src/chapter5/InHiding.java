package chapter5;

public class InHiding {
  private int id;
  private String name;
  
  // 프라이빗으로 막아놨는데 접근하려면 set 하거나 get 하는 메소드를 만들어햐함
  
  public void setid(int pid) {
	  id= pid;
	  
  }//

/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
		
	 

	}


