import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;
//    private ResourceBundle ca;
//    private ResourceBundle es;
//    private ResourceBundle en;
//    private ResourceBundle fr;
    private HashMap<String,ResourceBundle> data;


    private I18NManager(){
        data = new HashMap<String,ResourceBundle>();
//        ca = ResourceBundle.getBundle("ca");
//        es = ResourceBundle.getBundle("es");
//        en = ResourceBundle.getBundle("en");
//        fr = ResourceBundle.getBundle("fr");
//        data.put("ca",ca);
//        data.put("es",es);
//        data.put("en",en);
//        data.put("fr",fr);
    }

    public static I18NManager getInstance(){
        if (instance == null) instance = new I18NManager();
        return instance;
    }

    public void clear() {
        instance = null;
    }

    public String getText(String lan, String key) {
        ResourceBundle rb = data.get(lan);
        if (rb == null) {
            rb = ResourceBundle.getBundle((lan));
            data.put(lan,rb);
        }
        return rb.getString(key);
    }
}
