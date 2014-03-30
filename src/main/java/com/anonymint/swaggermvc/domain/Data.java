package com.anonymint.swaggermvc.domain;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Data Domain
 *
 * @author <a href="mailto:mint.com@gmail.com">anonymint</a>
 * @date 2014-03-28
 */
@ApiModel(value = "Data Model")
public class Data {
    @ApiModelProperty(value = "Id of the data", required = true)
    private Long id;
    @ApiModelProperty(value = "Type of the data", required = true, allowableValues = "A, B, C")
    private String type;
    @ApiModelProperty(value = "Type of the data", required = true, allowableValues = "A, B, C")
    private String description;
    private String dateUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
}
