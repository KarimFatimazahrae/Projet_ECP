package formValidation.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import formValidation.formbean.EvaluateurForm;
import formValidation.model.Evaluateur;
import formValidation.model.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EvaluateurDAO {

        // Config in WebSecurityConfig
        @Autowired
        private PasswordEncoder passwordEncoder;

        private static final Map<Long, Evaluateur> EVALUATEURS_MAP = new HashMap<>();

        static {
            initDATA();
        }

        private static void initDATA() {
            String encrytedPassword = "";

            Evaluateur andlat = new Evaluateur(1L, "andlat", "Andlat", "Andlat", //
                    1, Gender.FEMALE, "andlat@gmail.com", encrytedPassword, "KM");

            Evaluateur mbaraka = new Evaluateur(2L, "mbaraka", "Mbaraka", "Mbaraka", //
                    3, Gender.MALE, "mbaraka@gmail.com", encrytedPassword, "KL");

            EVALUATEURS_MAP.put(andlat.getUserId(), andlat);
            EVALUATEURS_MAP.put(mbaraka.getUserId(), mbaraka);
        }

        public Long getMaxUserId() {
            long max = 0;
            for (Long id : EVALUATEURS_MAP.keySet()) {
                if (id > max) {
                    max = id;
                }
            }
            return max;
        }

    public Evaluateur findEvaluateurByUserName(String userName) {
        Collection<Evaluateur> appUsers = EVALUATEURS_MAP.values();
        for (Evaluateur u : appUsers) {
            if (u.getUserName().equals(userName)) {
                return u;
            }
        }
        return null;
    }

    public Evaluateur findEvaluateurByEmail(String email) {
        Collection<Evaluateur> appUsers = EVALUATEURS_MAP.values();
        for (Evaluateur u : appUsers) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }

    public List<Evaluateur> getEvaluateurs() {
        List<Evaluateur> list = new ArrayList<>();

        list.addAll(EVALUATEURS_MAP.values());
        return list;
    }

    public Evaluateur createEvaluateur(EvaluateurForm form) {
        Long userId = this.getMaxUserId() + 1;
        String encrytedPassword = this.passwordEncoder.encode(form.getPassword());

        Evaluateur user = new Evaluateur(userId, form.getUserName(), //
                form.getFirstName(), form.getLastName(), 1, //
                form.getGender(), form.getEmail(), form.getCountryCode(), //
                encrytedPassword);

        EVALUATEURS_MAP.put(userId, user);
        return user;
    }
}
