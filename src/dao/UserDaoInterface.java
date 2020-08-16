package dao;

import model.User;

public interface UserDaoInterface {

	int signup(User user) throws ClassNotFoundException;

	boolean loginUser(User user) throws ClassNotFoundException;
}
