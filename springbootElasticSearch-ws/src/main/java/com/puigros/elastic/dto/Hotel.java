package com.puigros.elastic.dto;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
/**
 * Created by gpuigros on 22/08/17.
 */
@Data
@Document(indexName = "hotel", type = "hotels")
public class Hotel {

        @Id
        private String id;
        private String giata;
        private String name;

}
