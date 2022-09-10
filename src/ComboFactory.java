import java.util.HashMap;

public class ComboFactory implements iFactory {
    private static HashMap<String,iComboPrototype> prototipos;

    @Override
    public void addPrototype(String name, iComboPrototype prototype) {
        prototipos.put(name, prototype);
        
    }

    @Override
    public iComboPrototype getPrototype(String key) {
       prototipos.get(key);
        return null;
    }


}
