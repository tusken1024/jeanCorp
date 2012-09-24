package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

@Security.Authenticated(SecurityHandler.class)
public class Accueil extends Controller {

	public static Result accueil() {
		return ok(views.html.accueil.render("Hello"));
	}

}
