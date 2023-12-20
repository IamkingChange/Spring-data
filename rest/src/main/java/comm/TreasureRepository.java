package comm;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "treasures", path = "treasures")
public interface TreasureRepository extends CrudRepository<Treasure, Long> {

}
