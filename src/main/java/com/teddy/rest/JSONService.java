package com.teddy.rest;

import org.apache.commons.httpclient.HttpStatus;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/product")
public class JSONService {

    @GET
    @Path("/get")
    @Produces("application/json")
    public Product getProductInJSON() {

        Product product = new Product();
        product.setName("iPad 3");
        product.setQty(999);

        return product;

    }

    @POST
    @Path("/post")
    @Consumes("application/json")
    public Response createProductInJSON(Product product) {

        String result = "Product created : " + product;
        return Response.status(201).entity(result).build();

    }
    // For Spring Web MVC
/*
    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public ResponseEntity<Product> save(@RequestBody Product product) {

        if (product != null) {
            product.setQty(product.getQty());
            product.setName(product.getName());
        }

        System.out.println("|| " + product.toString());
        // TODO: call persistence layer to update
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }
*/
}