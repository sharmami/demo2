package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author amit@springtutorials.com
 */
@Api(description = "REST API for composite product information.")
@RestController
public class HomeController {

    private int counter = 0;

    @ApiOperation(
            value = "${api.product-composite.get-composite-product.description}",
            notes = "${api.product-composite.get-composite-product.notes}")
    @ApiResponses(value = {
        @ApiResponse(code = 400, message = "Bad Request, invalid format of the request. See response message for more information."),
        @ApiResponse(code = 404, message = "Not found, the specified id does not exist."),
        @ApiResponse(code = 422, message = "Unprocessable entity, input parameters caused the processing to fails. See response message for more information.")
    })
    @GetMapping("/hello")
    public String hello(){
        System.out.println("HERE "+counter++);
        return "Hello! from Amit "+counter;
    }
}
