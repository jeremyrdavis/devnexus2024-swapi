package io.arrogantprogrammer.swapi.infrastructure;

import io.arrogantprogrammer.swapi.domain.*;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface SwapiClient {

    @GET
    @Path("/people/{id}/")
    PersonRecord getPerson(@PathParam("id") int id);

    @GET
    @Path("/people/")
    PeopleResponse getAllPeople();

    @GET
    @Path("/films/")
    FilmsResponse getAllFilms();

    @GET
    @Path("/films/{id}")
    FilmRecord getFilm(@PathParam("id") int id);

    @GET
    @Path("/vehicles/")
    VehicleResponse getAllVehicles();

    @GET
    @Path("/vehicles/{id}")
    VehicleRecord getVehicle(@PathParam("id") int id);
//
//    @GET
//    @Path("/species/")
//    SpeciesResponse getAllSpecies();
//
//    @GET
//    @Path("/vehicles/")
//    VehicleResponse getAllVehicles();
}