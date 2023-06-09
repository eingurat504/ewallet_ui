//package com.example.tabapp.adapter;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.tabapp.R;
//import com.example.tabapp.model.Item;
//
//import java.util.List;
//
//public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
//
//    private List<Item> mItems;
//
//    public ItemAdapter(List<Item> items, ItemListener listener) {
//        mItems = items;
//        mListener = listener;
//    }
//
//    public void setListener(ItemListener listener) {
//        mListener = listener;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return new ViewHolder(LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.adapter, parent, false));
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        holder.setData(mItems.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        return mItems.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//
//        public ImageView imageView;
//        public TextView textView;
//        public Item item;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            itemView.setOnClickListener(this);
//            imageView = (ImageView) itemView.findViewById(R.id.imageView);
//            textView = (TextView) itemView.findViewById(R.id.textView);
//        }
//
//        public void setData(Item item) {
//            this.item = item;
//            imageView.setImageResource(item.getDrawableResource());
//            textView.setText(item.getTitle());
//        }
//
//        @Override
//        public void onClick(View v) {
//            if (mListener != null) {
//                mListener.onItemClick(item);
//            }
//        }
//    }
//
//    public interface ItemListener {
//        void onItemClick(Item item);
//    }
//}
