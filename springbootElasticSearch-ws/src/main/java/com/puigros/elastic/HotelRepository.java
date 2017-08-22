package com.puigros.elastic;

import com.puigros.elastic.dto.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by gpuigros on 22/08/17.
 */
public interface HotelRepository extends ElasticsearchRepository<Hotel, String> {
    List<Hotel> findByName(String name);

}
