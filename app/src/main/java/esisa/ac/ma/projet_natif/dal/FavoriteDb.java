package esisa.ac.ma.projet_natif.dal;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import esisa.ac.ma.projet_natif.entities.Favorite;

@Database(entities = {Favorite.class}, version = 1)
public abstract class FavoriteDb extends RoomDatabase {
public abstract FavoriteDao favoriteDao();
}

