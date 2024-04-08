package esisa.ac.ma.projet_natif.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import esisa.ac.ma.projet_natif.views.CallFragment;
import esisa.ac.ma.projet_natif.views.ContactFragment;
import esisa.ac.ma.projet_natif.views.FavoriteFragment;
import esisa.ac.ma.projet_natif.views.SmsFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){

            case 0:
                return new ContactFragment();
            case 1:
                return new SmsFragment();
            case 2:
                return new CallFragment();
            case 3:
                return  new FavoriteFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
