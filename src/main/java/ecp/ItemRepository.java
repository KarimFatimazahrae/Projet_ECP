package ecp;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {


   /* @Query("select item.It_ID, item.It_Nom\n" +
            "from item, sous_echelle, echelle\n" +
            "where echelle.Ec_ID  = 1 and sous_echelle.So_Ec_ID=echelle.Ec_ID and item.It_So_ID=sous_echelle.So_ID")*/

    List<Item> findItemByIt_So_ID(final int It_So_ID);

}
