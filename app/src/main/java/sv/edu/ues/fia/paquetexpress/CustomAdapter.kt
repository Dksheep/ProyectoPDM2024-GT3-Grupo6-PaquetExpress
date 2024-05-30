package sv.edu.ues.fia.paquetexpress

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemName: TextView
        var itemMail: TextView

        init{
            itemName = itemView.findViewById(R.id.item_name)
            itemMail = itemView.findViewById(R.id.item_mail)
        }
    }

    //- Imprime las listas
    val names = arrayListOf("Juan Ramirez",
        "Luis Polanco",
        "Jose Medrano",
        "Miguel Hernandez"
        )
    val mails = arrayListOf("jram102@gmail.com",
        "polanco112@gmail.com",
        "jos01medrano@gmail.com",
        "hernandezmiguel00@outlook.com")

    override fun onCreateViewHolder(viewGroup: ViewGroup,i: Int): ViewHolder{
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemName.text = names[i]
        viewHolder.itemMail.text = mails[i]
    }

    override fun getItemCount(): Int {
        return names.size
    }
}