package com.puigros.elastic.dto;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

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
        @Field(type = FieldType.Nested)
        private List<Room> rooms;
}
