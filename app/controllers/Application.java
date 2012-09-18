package controllers;

import models.Manager;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

	public static Form<Manager> loginForm = form(Manager.class);

	public static Result index() {
		return redirect(routes.Application.login());
	}

	public static Result login() {
		return ok(views.html.login.render("Hello", loginForm));
	}

}