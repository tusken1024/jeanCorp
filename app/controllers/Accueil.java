package controllers;

import java.util.List;

import models.Employee;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

@Security.Authenticated(SecurityHandler.class)
public class Accueil extends Controller {

	public static Result accueil() {
		List<Employee> employees = Employee.findAll();
		return ok(views.html.accueil.render("Hello" , employees));
	}

}
