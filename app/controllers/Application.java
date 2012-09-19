package controllers;

import models.Manager;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public static Form<Manager> loginForm = form(Manager.class);

	public static Result index() {
		return redirect(routes.Application.login());
	}

	public static Result login() {
		return ok(views.html.login.render("Hello", loginForm));
	}
	
	public static Result checkLogin(){
		Form<Manager> filledForm = loginForm.bindFromRequest();
		if(filledForm.hasErrors()){
			return badRequest(views.html.login.render("Error",loginForm));
		}
		return TODO;
	}

}