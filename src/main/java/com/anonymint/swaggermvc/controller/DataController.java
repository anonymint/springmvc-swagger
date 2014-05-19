package com.anonymint.swaggermvc.controller;

import com.anonymint.swaggermvc.domain.Data;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;

/**
 * Controller
 *
 * @author <a href="mailto:mint.com@gmail.com">anonymint</a>
 * @date 2014-03-28
 */
@Controller
@RequestMapping(value = "/data")
@Api(value = "data", description = "Gropu description")
public class DataController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Find data by ID", notes = "This is way we can get data by providing ID")
    @ResponseBody
    public Data getData(@PathVariable String id) {
        Data data = new Data();
        Long idl = Long.valueOf(id);
        data.setId(idl);
        data.setType("A");
        data.setDescription(String.format("This is Id %s", idl));
        data.setDateUpdate(new Date().toString());
        return data;
    }
}
