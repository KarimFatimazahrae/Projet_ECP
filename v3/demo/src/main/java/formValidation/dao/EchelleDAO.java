package formValidation.dao;

import formValidation.model.EchelleT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EchelleDAO {
    private static final Map<Integer, EchelleT> ECHELLES_MAP = new HashMap<>();

    static {
        initDATA();
    }

    private static void initDATA() {

    }


    public EchelleT findEchelleByID(int echelleId) {
        return ECHELLES_MAP.get(echelleId);

    }

    public List<EchelleT> getEchelle() {
        List<EchelleT> list = new ArrayList<>();
        list.addAll(ECHELLES_MAP.values());
        return list;
    }
}
