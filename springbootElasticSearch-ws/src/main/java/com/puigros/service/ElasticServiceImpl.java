package com.puigros.service;

import com.puigros.dto.HotelDTO;
import com.puigros.elastic.HotelRepository;
import com.puigros.elastic.dto.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by gpuigros on 21/08/17.
 */
@Service("ElasticService")
public class ElasticServiceImpl implements ElasticService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> findByName(String name){
        return hotelRepository.findByName(name);
    }
    @Override
    public List<HotelDTO> findAll(){
        List<HotelDTO> hotelsDTO=new ArrayList<>();
        Iterable<Hotel> hotels = hotelRepository.findAll();
        if (hotels!=null ){
            Iterator<Hotel> ite = hotels.iterator();
            while(ite.hasNext()){
                Hotel hot = ite.next();
                HotelDTO hotelDTO=new HotelDTO();
                hotelDTO.setId(hot.getId());
                hotelDTO.setGiata(hot.getGiata());
                hotelDTO.setName(hot.getName());
                hotelsDTO.add(hotelDTO);
            }
        }
        return hotelsDTO;
    }

    @Override
    public Hotel findOne(String id){
        return hotelRepository.findOne(id);
    }
    @Override
    public void save(Hotel hotel){
        hotelRepository.save(hotel);
    }
    @Override
    public void delete(Hotel hotel){
        hotelRepository.delete(hotel);
    }
}
