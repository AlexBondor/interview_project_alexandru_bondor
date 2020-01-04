package com.places.integration.repository;

<<<<<<< Updated upstream
import com.places.server.config.AppModule;
=======
import com.places.integration.config.AppTestModule;
import com.places.integration.config.GuiceTestRunner;
import com.places.integration.config.WithModules;
>>>>>>> Stashed changes
import com.places.server.entity.Place;
import com.places.integration.config.GuiceTestRunner;
import com.places.integration.config.WithModules;
import com.places.server.repository.PlaceRepository;
import javax.inject.Inject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(GuiceTestRunner.class)
<<<<<<< Updated upstream
@WithModules({AppModule.class})
=======
@WithModules({AppTestModule.class})
>>>>>>> Stashed changes
public class PlaceRepositoryTest {

  @Inject
  private PlaceRepository placeRepository;

  @Test
  public void testSavePlace() {
    final Place place = new Place();
    place.setName("random");

    final Place savedPlace = placeRepository.save(place);

    Assert.assertNotNull(savedPlace);
    Assert.assertNotNull(savedPlace.getId());
    Assert.assertEquals("random", savedPlace.getName());
  }
}
