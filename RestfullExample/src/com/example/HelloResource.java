package com.example;

 
@Path("/bonjour")


public class HelloResource {
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String direBonjour() {
        return "Bonjour, tout le monde!";
    }

}
