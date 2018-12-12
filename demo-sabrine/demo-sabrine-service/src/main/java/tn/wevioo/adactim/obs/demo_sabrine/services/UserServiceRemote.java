package tn.wevioo.adactim.obs.demo_sabrine.services;

import javax.ejb.Remote;

import tn.wevioo.adactim.obs.demo_sabrine.entities.User;
import tn.wevioo.adactim.obs.demo_sabrine.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
