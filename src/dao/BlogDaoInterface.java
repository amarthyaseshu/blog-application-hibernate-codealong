package dao;

import java.sql.SQLException;
import java.util.List;

import model.Blog;

public interface BlogDaoInterface {

	void insertBlog(Blog blog) throws ClassNotFoundException;

	Blog selectBlog(int blogId);

	List<Blog> selectAllBlogs() throws ClassNotFoundException;

	void deleteBlog(int id) throws ClassNotFoundException, SQLException;

	void updateBlog(Blog blog);

}
