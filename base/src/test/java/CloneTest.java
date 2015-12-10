import org.junit.Test;
import org.doomdark.uuid.UUIDGenerator;

import java.util.logging.Logger;

/**
 * Created by haining on 15/7/27.
 */
public class CloneTest {
    Logger logger = Logger.getLogger("CloneTest");
    @Test
    public void test() {
//        JsonConfig config = new JsonConfig();
//        config.setIgnoreDefaultExcludes(true);  //默认为false，即过滤默认的key
//        JSONObject jsonObject = JSONObject.fromObject(new Student("fdsa","dfsa",3));
//        String jso= jsonObject.toString();
//        JSONObject jsonObject1 = JSONObject.fromObject(jso);
//        jsonObject.put("ll","fdsafdsa");
//        System.out.print(jsonObject.toString()+"\n"+jsonObject1.toString());
//        System.out.print(jsonObject.toString());
//        long expires = 60l*30;
//        Date date = new Date(System.currentTimeMillis() + 1000*expires);
//        SimpleDateFormat format = new SimpleDateFormat("HH/mm/ss");
//        System.out.print(format.format(new Date())+"\n");
//        System.out.print(format.format(date));
//        String  a = "3242";
//        System.out.print(a.matches("\\d{4}"));


//        RandomUtil.createRandomCharData(6,true);

//        String temp = "2400-01-8";
//        System.out.print(temp.matches("[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}"));
//        System.out.print("我AAA".length()+"||"+"a我的".length());
//
//        char[] temp = "我AAA".toCharArray();
//        for (char a : temp){
//            System.out.print(a);
//        }
//        char[] temp1 = "a我的".toCharArray();
//        for (char a : temp1){
//            System.out.print(a);
//        }
        System.out.print(UUIDGenerator.getInstance().generateRandomBasedUUID().toString().replaceAll("-", "").length()+"\n");
        System.out.print(UUIDGenerator.getInstance().generateRandomBasedUUID().toString()+"\n");
        System.out.print(UUIDGenerator.getInstance().generateRandomBasedUUID().toString()+"\n");
        System.out.print(UUIDGenerator.getInstance().generateRandomBasedUUID().toString()+"\n");
        try{
            String temp = "";
            String temp1 = null;
            temp.trim();
            temp1.trim();
        } catch (Exception e){
            e.printStackTrace();
        }




    }



}
