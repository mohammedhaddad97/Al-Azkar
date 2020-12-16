package com.example.azkar;

import android.content.Context;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static androidx.fragment.app.FragmentActivity.*;

public class ZikrRecyclerAdapter extends RecyclerView.Adapter<ZikrRecyclerAdapter.ViewHolder>{

    final private Context mContext;
    final private List<Zikr> mAzkar;
    private final LayoutInflater mLayoutInflater;

    public ZikrRecyclerAdapter(Context context, List<Zikr> azkar) {
        mContext = context;
        mAzkar = azkar;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = mLayoutInflater.inflate(R.layout.list_item_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mCurrentPos = position;

        Zikr zikr = mAzkar.get(position);

        holder.mZikrMessage.setText(zikr.getZikrText());

        String num = Integer.toString(zikr.getNumOfRepetitions());
        holder.mNumReps.setText(num);

        if(zikr.getAddInfo().equals("nothing")) {
            holder.mAddInfo.setVisibility(View.GONE);
        } else {
            holder.mAddInfo.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return mAzkar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public final TextView mZikrMessage;
        public final TextView mNumReps;
        public final ImageView mAddInfo;
        public int mCurrentPos;
        private final ImageView mReset;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mZikrMessage = itemView.findViewById(R.id.zikr_message);
            mNumReps = itemView.findViewById(R.id.num_reps);
            mAddInfo = itemView.findViewById(R.id.add_info);
            mReset = itemView.findViewById(R.id.button_reset);

            mZikrMessage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    String s = mNumReps.getText().toString();
                    int n = Integer.valueOf(s);
                    n--;
                    if(n <= 0) {
                        n = 0;
                    }
                    mNumReps.setText(Integer.toString(n));

                }
            });

            mReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Zikr mZikr = mAzkar.get(mCurrentPos);
                    int n = mZikr.getNumOfRepetitions();

                    mNumReps.setText(Integer.toString(n));
                }
            });

            mAddInfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Zikr mZikr = mAzkar.get(mCurrentPos);

                    String info = mZikr.getAddInfo();

                    DisplayZikrdialog displayZikrdialog = new DisplayZikrdialog(info);
                    displayZikrdialog.show(((FragmentActivity)mContext).getSupportFragmentManager(), "Zikr Message");
                }
            });
        }
    }

}
