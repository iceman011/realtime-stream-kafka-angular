package ngdemo.rest;

import ngdemo.domain.User;
import ngdemo.service.UserService;
import ngdemo.stream.KafkaConsumer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/users")
public class UserRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultUserInJSON() {
        UserService userService = new UserService();
        return userService.getDefaultUser();
    }

    @Path("/wiki")    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getWiki() {
        KafkaConsumer.start();
	return "GetWikiCalled";
    }

}
