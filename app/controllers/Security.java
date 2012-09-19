package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import service.SecurityService;
import views.html.index;

public class Security extends Controller {

	private static final SecurityService SECURITY_SERVICE = new SecurityService();

	private static Result login() {
		return ok(index.render("Your new application is ready."));
	}
}
