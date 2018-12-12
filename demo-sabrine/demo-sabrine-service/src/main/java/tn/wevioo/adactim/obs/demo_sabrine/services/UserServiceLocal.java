package tn.wevioo.adactim.obs.demo_sabrine.services;

import javax.ejb.Local;

import tn.wevioo.adactim.obs.demo_sabrine.entities.User;
import tn.wevioo.adactim.obs.demo_sabrine.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
