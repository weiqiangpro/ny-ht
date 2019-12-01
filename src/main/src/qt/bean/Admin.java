package qt.bean;

public class Admin {
    private String uname;

    private String upasswd;

    private String usessionid;

    private String username;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpasswd() {
        return upasswd;
    }

    public void setUpasswd(String upasswd) {
        this.upasswd = upasswd == null ? null : upasswd.trim();
    }

    public String getUsessionid() {
        return usessionid;
    }

    public void setUsessionid(String usessionid) {
        this.usessionid = usessionid == null ? null : usessionid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}