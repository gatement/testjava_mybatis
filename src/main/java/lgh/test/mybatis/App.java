package lgh.test.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lgh.test.mybatis.BlogMapper.Blog;

public class App {
	public static void main(String[] args) throws Exception {
		String resource = "lgh/test/mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Blog blog = (Blog) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 1);
			System.out.println("id=" + blog.id + ", name=" + blog.name);
		} finally {
			session.close();
		}
	}
}
