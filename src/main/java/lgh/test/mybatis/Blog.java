package lgh.test.mybatis;

/**
 * DO
 * 
 * @author JohnsonLau
 * @date 2017/10/20
 */
public class Blog {
	private Integer id;
	private String name;

	public Blog(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Blog [id=%s, name=%s]", id, name);
	}
}
