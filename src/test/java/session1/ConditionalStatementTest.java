package session1;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConditionalStatementTest {

    String url="www.google.com";

    @Test
    public  void  ternaryAddHttp(){
        url = url.startsWith("http") ? url : addHttp(url);
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.google.com",url);
    }

    private  String addHttp(String url){
        return "http://"+url;
    }


    @Test

    public void  ifAddHttp(){
        if(!url.startsWith("http")){
            url=addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.google.com",url);
    }

    @Test
    public  void IfElseAddHttp(){
        if(url.startsWith("http")){
            //do nothing
        }   else {
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.google.com",url);
    }

    @Test
    public void  ifElseNestedAddHttp(){
        String url = "google.com";
        if (url.startsWith("http")){

        }   else {
                if ((!url.startsWith("www"))){
                    url = "www."+url;
                }
                url=addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.google.com",url);

    }

    public String likelyGender(String title){
        String likelyGender;

        switch (title.toLowerCase()){
            case "sir":
                likelyGender = "M";
                break;
            case  "mr":
                likelyGender = "M";
                break;
            default:
                likelyGender ="F";
                break;
        }
        return likelyGender;
    }

    @Test
    public void switchEx(){
        assertEquals("M",likelyGender("sir"));
        assertEquals("M",likelyGender("mr"));
    }

}
