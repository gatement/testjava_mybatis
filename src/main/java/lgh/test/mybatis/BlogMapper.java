package lgh.test.mybatis;

public interface BlogMapper {
	void insertBlog(String name);
	void updateBlog(Blog blog);
	void deleteBlog(int id);
	Blog selectBlog(int id);
}
