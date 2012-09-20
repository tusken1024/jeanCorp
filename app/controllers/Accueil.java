package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.Security.Authenticated;

@Security.Authenticated(SecurityHandler.class)
public class Accueil extends Controller {

	public static Result accueil() {
		return ok(views.html.accueil.render("Hello"));
	}

	
}
