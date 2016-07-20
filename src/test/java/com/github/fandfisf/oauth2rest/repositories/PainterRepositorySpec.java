package com.github.fandfisf.oauth2rest.repositories;

import com.github.fandfisf.oauth2rest.Oauth2restApplication;
import com.github.fandfisf.oauth2rest.model.Painter;
import org.hibernate.validator.internal.util.Contracts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

/**
 * Created by Prashant S Khanwale @ Suveda LLC  on 7/16/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Oauth2restApplication.class)
@WebAppConfiguration
public class PainterRepositorySpec {
    @Autowired  private PainterRepository target = null;
    @Test
    public void yellowCanary(){
        Contracts.assertNotNull(target);
    }
    @Test
    public void pullOneById(){
        final Painter vvg = target.findOne(1L);
        Contracts.assertNotNull(vvg);
        assertEquals(vvg.getPseudonym(),"The Little Painter Fellow");
    }
    @Test
    public void pullByPseudonym(){
        final Painter sp = target.findByPseudonym("Pre-historic San People").get(0);
        Contracts.assertNotNull(sp);
        assertEquals(sp.getFirstName(),"San");
    }
    @Test
    public void pullByLastName(){
        final Painter sp = target.findByLastName("van Gogh").get(0);
        Contracts.assertNotNull(sp);
        assertEquals(sp.getFirstName(),"Vincent");
    }
}
