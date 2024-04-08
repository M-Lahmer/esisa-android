package esisa.ac.ma.projet_natif.services;

import android.content.Context;
import android.os.AsyncTask;

import androidx.room.Room;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import esisa.ac.ma.projet_natif.dal.FavoriteDao;
import esisa.ac.ma.projet_natif.dal.FavoriteDb;
import esisa.ac.ma.projet_natif.entities.Favorite;
public class ManageFavorite {
    private FavoriteDb db;
    private FavoriteDao favoriteDao;
    private ExecutorService executorService;
    public ManageFavorite(Context context){
         db= Room.databaseBuilder(context,FavoriteDb.class, "favorite.db").build();
         favoriteDao= db.favoriteDao();
         executorService= Executors.newSingleThreadExecutor();
    }
    public List<Favorite> getAll(){
        //One can use lambda
     Future<List<Favorite>> results=executorService.submit(new Callable<List<Favorite>>() {
         @Override
         public List<Favorite> call() throws Exception {
             return favoriteDao.getAll();
         }
     });
     try {
            return results.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void add(Favorite favorite){
       executorService.execute(()->favoriteDao.add(favorite));
    }

}
