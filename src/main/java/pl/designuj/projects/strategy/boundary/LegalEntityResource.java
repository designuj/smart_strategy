package pl.designuj.projects.strategy.boundary;

import com.google.common.base.Enums;
import pl.designuj.projects.strategy.entity.ValidationScheme;
import pl.designuj.projects.strategy.service.LegalEntityService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * created by designuj on 30/01/2020
 */

@Path("/")
public class LegalEntityResource {

    @Inject
    private LegalEntityService service;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getLegalEntity(@PathParam("id") Long id) {
        return Response
                .ok(service.validLegalEntity(id))
                .build();
    }
}
