package ma.hansal.control_front.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ma.hansal.control_front.R;
import ma.hansal.control_front.classes.Employe;

public class EmployeAdapter extends RecyclerView.Adapter<EmployeAdapter.ViewHolder> {
    private List<Employe> employes;

    public EmployeAdapter(List<Employe> employes) {
        this.employes = employes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.employe_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Employe employe = employes.get(position);
        holder.textViewNom.setText("Nom: " + employe.getNom());
        holder.textViewPrenom.setText("Prenom: " + employe.getPrenom());
        holder.textViewDateNaissance.setText("date: " + employe.getDateNaissance());

        // Ajoute d'autres liaisons de données si nécessaire
    }

    @Override
    public int getItemCount() {
        return employes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewNom;
        public TextView textViewPrenom;

        public TextView textViewDateNaissance;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewNom = itemView.findViewById(R.id.textViewNom);
            textViewPrenom = itemView.findViewById(R.id.textViewPrenom);
            textViewDateNaissance = itemView.findViewById(R.id.textViewDateNaissance);
        }
    }
}
