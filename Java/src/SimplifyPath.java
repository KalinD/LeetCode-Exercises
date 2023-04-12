import java.util.ArrayList;
import java.util.List;

public class SimplifyPath {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        for(String s : path.split("/")){
            if(s.equals(".") || s.equals("")){
                continue;
            }else if(s.equals("..")){
                if(sb.length() > 0) {
                    sb.delete(sb.lastIndexOf("/"), sb.length());
                }
            }else{
                sb.append("/");
                sb.append(s);
            }
        }

        if(sb.isEmpty()){
            sb.append("/");
        }

        return sb.toString();
    }
}
