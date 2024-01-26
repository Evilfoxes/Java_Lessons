import java.util.HashMap;
import java.util.Map;

public class Passport {
  MapString, String> passport = new HashMap<>();

  public void addPassport(String Id, String name) {
      passport.put(Id, name);
  }
  public String search (String name) {
      StringBuilder stringBuilder = new StringBuilder();
      for (String key: passport.keySet()) {
          if (passport.get(key),equals(name)) {
              stringBuilder.append(key);
              stringBuilder.append(" ");

          }
      }
      return stringBuilder.toString().trim();
  }
}