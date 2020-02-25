package formValidation.dao;


import formValidation.model.TypeEvaluateur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeEvaluateurDAO {

    private static final Map<Integer, TypeEvaluateur> TYPE_EVALUATEUR_MAP = new HashMap<>();

    static {
        initDATA();
    }

    private static void initDATA() {

        TypeEvaluateur psy = new TypeEvaluateur(1,"Psychologue");
        TypeEvaluateur pro = new TypeEvaluateur(2,"Proche");
        TypeEvaluateur proche = new TypeEvaluateur(3,"Proche");

        TYPE_EVALUATEUR_MAP.put(psy.getTypeEvaluateurID(), psy);
        TYPE_EVALUATEUR_MAP.put(pro.getTypeEvaluateurID(), pro);
        TYPE_EVALUATEUR_MAP.put(proche.getTypeEvaluateurID(), proche);

    }


    public TypeEvaluateur findTypeEvaluateurByID(int typeEvaluateurID) {
        return TYPE_EVALUATEUR_MAP.get(typeEvaluateurID);
    }

    public List<TypeEvaluateur> getTypeEvaluateur() {
        List<TypeEvaluateur> list = new ArrayList<>();
        list.addAll(TYPE_EVALUATEUR_MAP.values());
        return list;
    }
}
