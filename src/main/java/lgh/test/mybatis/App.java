package lgh.test.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class App {
	public static void main(String[] args) throws Exception {
		String resource = "lgh/test/mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		try (SqlSession session = sqlSessionFactory.openSession()) {
			// Blog blog = (Blog) session.selectOne("lgh.test.mybatis.BlogMapper.selectBlog", 1);
			BlogMapper mapper = session.getMapper(BlogMapper.class);
			Blog blog = mapper.selectBlog(1);
			System.out.println("id=" + blog.getId() + ", name=" + blog.getName());
		}
	}
}
