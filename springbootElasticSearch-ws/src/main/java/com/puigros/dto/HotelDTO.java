package com.puigros.dto;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by gpuigros on 22/08/17.
 */
@Data
public class HotelDTO {


        private String id;
        private String giata;
        private String name;

}
