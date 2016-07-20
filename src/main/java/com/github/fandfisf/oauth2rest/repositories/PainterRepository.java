package com.github.fandfisf.oauth2rest.repositories;

import com.github.fandfisf.oauth2rest.model.Painter;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Prashant S Khanwale @ Suveda LLC  on 7/16/16.
 */
public interface PainterRepository extends PagingAndSortingRepository<Painter, Long> {
    List<Painter> findByPseudonym(@Param("pseudonym") String pseudonym);
    List<Painter> findByLastName(@Param("lastName") String lastName);
}
