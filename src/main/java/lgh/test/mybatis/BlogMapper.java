package lgh.test.mybatis;

public interface BlogMapper {
	Blog selectBlog(int id);

	public class Blog {
		public int id;
		public String name;
	}
}
