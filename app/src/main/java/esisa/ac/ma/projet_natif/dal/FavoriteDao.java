package esisa.ac.ma.projet_natif.dal;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import esisa.ac.ma.projet_natif.entities.Favorite;
@Dao
public interface FavoriteDao {
    @Query("SELECT * FROM T_FAVORITE")
    List<Favorite> getAll();
    @Insert
    void add(Favorite favorite);

}
