package org.afpa.deuxactivity;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {

    //attribut
    private List<UserAccount> listUser;
    private LayoutInflater layoutInflater;
    private Context context;

    /**
     * Constructeur à 2 paramètres
     * @param listUser
     * @param context
     */
    //constructeur
    public CustomListAdapter(List<UserAccount> listUser, LayoutInflater layoutInflater, Context context) {
        this.listUser = listUser;
        this.layoutInflater = layoutInflater;
        this.context = context;
    }


    //Une classe statique pour le ViewHolder qui va contenir les infos de la vue:
    public class ViewHolder {
        ImageView rolePicView;
        TextView userNameView;
        TextView roleView;
    }

    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("unliste", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    @Override
    public int getCount() {
        return listUser.size();
    }

    @Override
    public Object getItem(int position) {
        return listUser.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
