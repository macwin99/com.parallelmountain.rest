package com.parallelmountain.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/status")
public class Status {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service</p>";
	}
	
}
