

import java.util.HashMap;
import java.util.Map;

/*
Формируем WHERE
*/
public class DZ2 {
    public static void main(String[] args) {
        Map<String, String> params1 = new HashMap<String,String>();
        params1.put("name","Ivanov");
        params1.put("country","Russia");
        params1.put("city","Moscow");
        params1.put("age",null);
        System.out.println(getQuery(params1));
        Map<String, String> params2 = new HashMap<String,String>();
        params2.put("name","Isagas");
        params2.put("country","Russia");
        params2.put("city","Magd");
        params2.put("age","28");
        System.out.println(getQuery(params2));
    }
    public static String getQuery(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }

}