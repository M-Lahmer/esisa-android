package esisa.ac.ma.projet_natif.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

import esisa.ac.ma.projet_natif.R;
import esisa.ac.ma.projet_natif.dal.ContactDao;
import esisa.ac.ma.projet_natif.entities.Contact;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.Item> {

    private Vector<Contact> model = new Vector<>();
    private Vector<Contact> cache = new Vector<>();
    private ContactDao contactDao;

    public Vector<Contact> getModel() {
        return model;
    }

    public ContactAdapter(Context context) {

        contactDao = new ContactDao(context);
        model = contactDao.getVcontact();
       System.out.println(model);
    }



    class Item extends RecyclerView.ViewHolder {
        TextView name;
        TextView date;
        TextView phones;

        public Item(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            date = itemView.findViewById(R.id.date);
            phones = itemView.findViewById(R.id.phones);
        }
    }

    @NonNull
    @Override
    public Item onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Item(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Item holder, int position) {
        holder.name.setText(model.get(position).getName());
        holder.date.setText(model.get(position).getDate());
        StringBuilder phones = new StringBuilder();
        for (String p : model.get(position).getPhones()) {
            phones.append(p).append("\n");
        }
        holder.phones.setText(phones);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}