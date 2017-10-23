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
			BlogMapper mapper = session.getMapper(BlogMapper.class);
			
			mapper.insertBlog("Anne");
			mapper.updateBlog(new Blog(1, "JohnsonLau3"));
			session.commit();

			// Blog blog = (Blog) session.selectOne("lgh.test.mybatis.BlogMapper.selectBlog", 1);
			Blog blog = mapper.selectBlog(1);
			System.out.println(blog);
		}
	}
}