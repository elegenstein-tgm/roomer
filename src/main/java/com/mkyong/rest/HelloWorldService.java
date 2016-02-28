package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public class HelloWorldService {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Jersey say : " + msg;

		return Response.status(200).entity(output).build();

	}

	@GET
	@Path("/room/{desc}/{day}/{month}/{year}/{lesson}")
	public Response getRoomLessonDetail(@PathParam("desc") String kbez, @PathParam("day") String day,@PathParam("month") String month,@PathParam("year") String year, @PathParam("lesson") String lesson){
		String sql	= "Select * from room";
		String output = "Raum: "+kbez+"\nDatum:" ;
		return Response.status(200).entity(output).build();
	}

}