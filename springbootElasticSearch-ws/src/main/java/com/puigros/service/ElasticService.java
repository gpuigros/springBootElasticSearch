package com.puigros.service;

import com.puigros.dto.HotelDTO;
import com.puigros.elastic.dto.Hotel;

import java.util.List;

/**
 * Created by gpuigros on 21/08/17.
 */
public interface ElasticService {

    List<Hotel> findByName(String name);

    List<HotelDTO> findAll();

    Hotel findOne(String id);

    void save(Hotel hotel);

    void delete(Hotel hotel);
}
