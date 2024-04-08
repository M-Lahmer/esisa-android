package esisa.ac.ma.projet_natif.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "T_favorite")
public class Favorite {
    @NonNull
    @PrimaryKey
    private  String phone;
    @ColumnInfo
    private String name;
    @ColumnInfo
    private long calls;
    private long sms;
    @NonNull
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getCalls() {
        return calls;
    }
    public void setCalls(long calls) {
        this.calls = calls;
    }
    public long getSms() {
        return sms;
    }
    public void setSms(long sms) {
        this.sms = sms;
    }

    @NonNull
    @Override
    public String toString() {
        return "{" +
                "'phone:'" + phone + '\'' +
                ", name:'" + name + '\'' +
                ", calls:" + calls +
                ", sms:" + sms +
                '}';
    }
}
