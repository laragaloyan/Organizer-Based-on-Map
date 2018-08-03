package com.maporganizer.mapsorganizer.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.maporganizer.mapsorganizer.R;

public class TaskHolder  extends RecyclerView.ViewHolder{


        private TextView mDescription;
        private TextView mDate;
        private TextView mTitle;

        public TaskHolder(View itemView) {

            super(itemView);
            mTitle = itemView.findViewById(R.id.title_view);
            mDescription = itemView.findViewById(R.id.description_view);
            mDate = itemView.findViewById(R.id.date_view);

        }

        public TextView getDescription() {
            return mDescription;
        }

        public void setDescription(TextView description) {
            mDescription = description;
        }

        public TextView getDate() {
            return mDate;
        }

        public void setDate(TextView date) {
            mDate = date;
        }

        public TextView getTitle() {
            return mTitle;
        }

        public void setTitle(TextView title) {
            mTitle = title;
        }
    }


