import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Naga on 13-03-2017.
 */
@WebServlet(name = "ImageService", urlPatterns = "/ImageService")
public class ImageService extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder buffer = new StringBuilder();
        BufferedReader reader = req.getReader();
        String response="";
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        String data = buffer.toString();
        System.out.println(data);
        String output = "";
        JSONObject params = new JSONObject(data);
        JSONObject result = params.getJSONObject("result");
        JSONObject parameters = result.getJSONObject("parameters");
        if (parameters.get("vehicles").toString().equals("vehicles")) {
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("https://static.pexels.com/photos/24353/pexels-photo.jpg");
            jsonArray.put("http://www.hybridcars.com/wp-content/uploads/2014/03/Unplugged_Tesla_ModelS-668.jpg");
            jsonArray.put("https://s-media-cache-ak0.pinimg.com/originals/6e/3c/62/6e3c622f78cafce45439b1bfe5a03c37.jpg");
            jsonArray.put("https://i.ytimg.com/vi/mo1EckuW-h0/0.jpg");
            jsonArray.put("http://www.inland-boats.com/images/PICT0115.JPG");
            jsonArray.put("http://www.hdwallpapers.in/walls/yamaha_r6_bike-HD.jpg");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "vehicles are displayed");
            js.put("displayText", "vehicles are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("vehicles").toString().equals("car")) {
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("https://static.pexels.com/photos/50704/car-race-ferrari-racing-car-pirelli-50704.jpeg");
            jsonArray.put("http://www.siwallpaperhd.com/wp-content/uploads/2015/07/race_car_background.jpg");
            jsonArray.put("https://i.ytimg.com/vi/4-PDH6sKsA0/hqdefault.jpg");
            jsonArray.put("http://media.caranddriver.com/images/media/638444/porsche-boxster-photo-640543-s-original.jpg");
            jsonArray.put("http://www.firsthdwallpapers.com/uploads/2014/03/ford-mustang-wallpapers-hq-high-quality.jpg");
            jsonArray.put("https://static.pexels.com/photos/120049/pexels-photo-120049.jpeg");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "cars are displayed");
            js.put("displayText", "cars are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("vehicles").toString().equals("bike")){
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("http://www.dilsecomments.com/wallpaper/medium/Bike-Wallpaper-229.jpg");
            jsonArray.put("http://www.pakweb.net/wp-content/uploads/2016/10/97911-vehicles-power-bike.jpg");
            jsonArray.put("https://foto.scigacz.pl/gallery/wiadomosci/2015/09/23/Ducati_Triumph_Vespa_i_Piaggio_na_Targach_Motoryzacyjnych_w_Gdansku/_Triumph_Daytona_675_R_z.jpg");
            jsonArray.put("https://s-media-cache-ak0.pinimg.com/originals/ae/9c/46/ae9c46dfd70daa441b61fe0d53f243c8.jpg");
            jsonArray.put("http://top10wala.in/wp-content/uploads/2013/07/bajaj-pulsar-200-cc.jpg");
            jsonArray.put("http://www.carsfame.com/wp-content/uploads/2015/04/Kawasaki-Ninja-H2-bike.jpg");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "bikes are displayed");
            js.put("displayText", "bikes are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("vehicles").toString().equals("boat")){
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("https://s-media-cache-ak0.pinimg.com/236x/62/48/21/6248214d7ac33807d5672176b9045b48.jpg");
            jsonArray.put("https://www.woodenboat.com/sites/default/files/events-calendar/wooden-boat-xlarge_2_0.jpg");
            jsonArray.put("https://s-media-cache-ak0.pinimg.com/originals/8b/e5/9c/8be59c43cbddafb9689337cdd4044450.jpg");
            jsonArray.put("https://s-media-cache-ak0.pinimg.com/originals/bb/b9/26/bbb9268fa88e07d0ff6ad50031f966fe.jpg");
            jsonArray.put("https://s-media-cache-ak0.pinimg.com/originals/f1/58/2f/f1582f8c1265b61303a4ff514ccb2a23.jpg");
            jsonArray.put("http://www.evergladesboats.com/sites/default/files/home-cta-3_0.jpg");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "boats are displayed");
            js.put("displayText", "boats are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("null").toString().equals("clear")){
            Data data_ob = Data.getInstance();
            JSONObject js1 = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(" ");
            js1.put("data", jsonArray);
            data_ob.setData(js1.toString());
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "screen is cleared");
            js.put("displayText", "screen is cleared");
            js.put("source", "image database");
            response = js.toString();
        }
        resp.setHeader("Content-type", "application/json");
        resp.getWriter().write(response);
    }
}
